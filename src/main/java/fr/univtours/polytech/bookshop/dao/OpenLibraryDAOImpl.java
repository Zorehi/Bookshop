package fr.univtours.polytech.bookshop.dao;

import fr.univtours.polytech.bookshop.model.openlibrary.Doc;
import fr.univtours.polytech.bookshop.model.openlibrary.WsOpenLibrary;
import jakarta.ejb.Stateless;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Stateless
public class OpenLibraryDAOImpl implements OpenLibraryDAO {
    private static String URL = "https://openlibrary.org";

    @Override
    public List<Doc> getBooks(String search, Integer limit) {
        // Instanciation du client.
        Client client = ClientBuilder.newClient();

        // On indique l'URL du Web Service.
        WebTarget target = client.target(URL);

        // On indique le "end point" (on aurait aussi pu directement le mettre dans
        // l'URL).
        // C'est également avec cette méthode qu'on pourrait ajouter des "path
        // parameters" si besoin.
        target = target.path("search.json");
        // On précise (lorsqu'il y en a) les "query parameters".
        target = target.queryParam("q", search);
        target = target.queryParam("limit", limit);
        target = target.queryParam("fields", "author_key,author_name,title,first_sentence,ratings_count,ratings_average");

        // On appelle le WS en précisant le type de l'objet renvoyé, ici un
        // WsOpenLibrary.
        System.out.println(target.getUri());
        WsOpenLibrary wsOpenLibrary = target.request(MediaType.APPLICATION_JSON).get(WsOpenLibrary.class);
        return wsOpenLibrary.getDocs();
    }
}
