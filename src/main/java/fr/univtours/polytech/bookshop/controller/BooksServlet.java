package fr.univtours.polytech.bookshop.controller;

import java.io.IOException;
import java.util.List;

import fr.univtours.polytech.bookshop.business.BookBusiness;
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

    @Inject
    private BookBusiness bookBusiness;

    @Inject
    private OpenLibraryBusiness openLibraryBusiness;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<BookBean> books = this.bookBusiness.getBooks();

        for (BookBean book : books) {
            Doc doc = openLibraryBusiness.searchBook(book.getAuthor(), book.getTitle());
            if (doc != null) {
                book.setRatings_count(doc.getRatingsCount());
                book.setRatings_average(doc.getRatingsAverage());
            }
        }

        request.setAttribute("BOOKS", books);

        request.getRequestDispatcher("books.jsp").forward(request, response);
    }
}
