package fr.univtours.polytech.bookshop.business;

import fr.univtours.polytech.bookshop.model.openlibrary.Doc;

import java.util.List;

public interface OpenLibraryBusiness {
    public Doc searchBook(String author, String title);
}
