package fr.univtours.polytech.bookshop.dao;

import fr.univtours.polytech.bookshop.model.openlibrary.Doc;

import java.util.List;

public interface OpenLibraryDAO {
    public List<Doc> getBooks(String search);
}
