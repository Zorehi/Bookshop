package fr.univtours.polytech.bookshop.business;

import fr.univtours.polytech.bookshop.dao.OpenLibraryDAO;
import fr.univtours.polytech.bookshop.model.openlibrary.Doc;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class OpenLibraryBusinessImpl implements OpenLibraryBusiness {
    @Inject
    private OpenLibraryDAO openLibraryDAO;

    @Override
    public Doc searchBook(String author, String title) {
        List<Doc> docList = openLibraryDAO.getBooks(title + " " + author, 1);
        if (docList.isEmpty()) { return null; }

        /*for (Doc doc : docList) {
            if (doc.getTitle() == null || doc.getAuthor_name() == null) continue;
            if (title.equals(doc.getTitle())
                    && doc.getAuthor_name().stream().anyMatch(author::equals)) {
                return doc;
            }
        }


        return null;*/
        return docList.get(0);
    }
}
