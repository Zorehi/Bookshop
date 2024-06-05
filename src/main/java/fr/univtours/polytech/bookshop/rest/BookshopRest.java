package fr.univtours.polytech.bookshop.rest;

import fr.univtours.polytech.bookshop.business.BookBusiness;
import fr.univtours.polytech.bookshop.business.ExchangeRateBusiness;
import fr.univtours.polytech.bookshop.business.OpenLibraryBusiness;
import fr.univtours.polytech.bookshop.model.BookBean;
import fr.univtours.polytech.bookshop.model.openlibrary.Doc;
import jakarta.ejb.EJB;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Path("v1")
public class BookshopRest {
    @EJB
    private BookBusiness bookBusiness;

    @EJB
    private ExchangeRateBusiness exchangeRateBusiness;

    @EJB
    private OpenLibraryBusiness openLibraryBusiness;

    @Path("books")
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<BookBean> getBooks(@QueryParam("auteur") String filtreAuteur, @QueryParam("titre") String filtreTitre) {
        List<BookBean> books = this.bookBusiness.getBooks();
        List<BookBean> results = books.stream()
                .filter(livre -> (filtreAuteur == null || livre.getAuthor().toLowerCase().contains(filtreAuteur.toLowerCase())))
                .filter(livre -> (filtreTitre == null || livre.getTitle().toLowerCase().contains(filtreTitre.toLowerCase())))
                .collect(Collectors.toList());

        Map<String, Double> conversionRates = exchangeRateBusiness.getConversionRate("EUR");
        for (BookBean bookBean : results) {
            Doc doc = openLibraryBusiness.searchBook(bookBean.getAuthor(), bookBean.getTitle());
            if (null != doc) {
                bookBean.setRatings_count(doc.getRatings_count());
                bookBean.setRatings_average(doc.getRatings_average());
                if (doc.getFirst_sentence() != null && !doc.getFirst_sentence().isEmpty()) {
                    bookBean.setFirst_sentence(doc.getFirst_sentence().get(0));
                }
            }
            if (bookBean.getPrice() != null) {
                BigDecimal bigDecimal = BigDecimal.valueOf(conversionRates.get(bookBean.getCurrency()) * bookBean.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
                bookBean.setConverted_price(bigDecimal.floatValue());
            }
        }

        return results;
    }
    @GET
    @Path("books/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public BookBean getBook(@PathParam("id") Integer idBook) {
        BookBean bookBean = this.bookBusiness.getBook(idBook);

        Map<String, Double> conversionRates = exchangeRateBusiness.getConversionRate("EUR");
        Doc doc = openLibraryBusiness.searchBook(bookBean.getAuthor(), bookBean.getTitle());
        if (null != doc) {
            bookBean.setRatings_count(doc.getRatings_count());
            bookBean.setRatings_average(doc.getRatings_average());
            if (doc.getFirst_sentence() != null && !doc.getFirst_sentence().isEmpty()) {
                bookBean.setFirst_sentence(doc.getFirst_sentence().get(0));
            }
        }
        if (bookBean.getPrice() != null) {
            BigDecimal bigDecimal = BigDecimal.valueOf(conversionRates.get(bookBean.getCurrency()) * bookBean.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
            bookBean.setConverted_price(bigDecimal.floatValue());
        }

        return bookBean;
    }

    @DELETE
    @Path("books/{id}")
    public Response deleteBook(@PathParam("id") Integer idBook,
                                   @HeaderParam(HttpHeaders.AUTHORIZATION) String auth) {
        if (!"42".equals(auth)) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        } else {
            BookBean locationBean = this.bookBusiness.getBook(idBook);
            if (null == locationBean) {
                return Response.status(Response.Status.NOT_FOUND).build();
            } else {
                this.bookBusiness.removeBook(idBook);
                return Response.status(Response.Status.NO_CONTENT).build();
            }
        }
    }

    @POST
    @Path("books")
    @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Response createBook(@HeaderParam(HttpHeaders.AUTHORIZATION) String auth, BookBean bookBean) {
        if (!"42".equals(auth))
        {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        else
        {
            this.bookBusiness.createBook(bookBean);
            return Response.status(Response.Status.ACCEPTED).build();
        }
    }

    @Transactional
    @PUT
    @Path("books/{id}")
    public Response putBook(@PathParam("id") Integer idBook, BookBean bookBean, @HeaderParam(HttpHeaders.AUTHORIZATION) String auth) {
        if (!"42".equals(auth))
        {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        else
        {
            BookBean bookBean1 = this.bookBusiness.getBook(idBook);
            if (null == bookBean1) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            bookBean1.setAuthor(bookBean.getAuthor());
            bookBean1.setCurrency(bookBean.getCurrency());
            bookBean1.setPrice(bookBean.getPrice());
            bookBean1.setTitle(bookBean.getTitle());
            this.bookBusiness.updateBook(bookBean1);
            return Response.status(Response.Status.ACCEPTED).build();
        }

    }
    @Transactional
    @PATCH
    @Path("books/{id}")
    public Response patchBook(@PathParam("id") Integer idBook, BookBean bookBean, @HeaderParam(HttpHeaders.AUTHORIZATION) String auth) {
        if (!"42".equals(auth))
        {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        else {


            BookBean bookBean1 = this.bookBusiness.getBook(idBook);
            if (null == bookBean1) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }

            // Seul les champs renseignés dans le bean envoyé sont mis à jour en base de données.
            if (null != bookBean.getCurrency() && !"".equals(bookBean.getCurrency())) {
                bookBean1.setCurrency(bookBean.getCurrency());
            }
            if (null != bookBean.getPrice() && !"".equals(bookBean.getPrice())) {
                bookBean1.setPrice(bookBean.getPrice());
            }
            if (null != bookBean.getTitle() && !"".equals(bookBean.getTitle())) {
                bookBean1.setTitle(bookBean.getTitle());
            }
            if (null != bookBean.getAuthor() && !"".equals(bookBean.getAuthor())) {
                bookBean1.setAuthor(bookBean.getAuthor());
            }

            this.bookBusiness.updateBook(bookBean1);
            return Response.status(Response.Status.ACCEPTED).build();
        }
    }


}
