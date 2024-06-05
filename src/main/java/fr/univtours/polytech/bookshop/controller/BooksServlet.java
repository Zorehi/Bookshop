package fr.univtours.polytech.bookshop.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import fr.univtours.polytech.bookshop.business.BookBusiness;
import fr.univtours.polytech.bookshop.business.ExchangeRateBusiness;
import fr.univtours.polytech.bookshop.business.OpenLibraryBusiness;
import fr.univtours.polytech.bookshop.model.BookBean;
import fr.univtours.polytech.bookshop.model.openlibrary.Doc;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("books")
public class BooksServlet extends HttpServlet {
    private static final String url = "https://covers.openlibrary.org/a/olid/";

    @Inject
    private BookBusiness bookBusiness;

    @Inject
    private OpenLibraryBusiness openLibraryBusiness;

    @Inject
    private ExchangeRateBusiness exchangeRateBusiness;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<BookBean> books = this.bookBusiness.getBooks();

        Map<String, Double> conversionRates = exchangeRateBusiness.getConversionRate("EUR");

        for (BookBean book : books) {
            Doc doc = openLibraryBusiness.searchBook(book.getAuthor(), book.getTitle());
            if (doc != null) {
                book.setRatings_count(doc.getRatings_count());
                book.setRatings_average(doc.getRatings_average());

            } else {
                book.setRatings_count(0);
                book.setRatings_average(0D);
                book.setAuthor_image(null);
            }
            if (book.getPrice() != null) {
                BigDecimal bigDecimal = BigDecimal.valueOf(conversionRates.get(book.getCurrency()) * book.getPrice()).setScale(2, BigDecimal.ROUND_HALF_UP);
                book.setConverted_price(bigDecimal.floatValue());
            }
        }

        request.setAttribute("BOOKS", books);

        request.getRequestDispatcher("books.jsp").forward(request, response);
    }
}
