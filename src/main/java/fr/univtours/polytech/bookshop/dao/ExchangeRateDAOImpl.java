package fr.univtours.polytech.bookshop.dao;

import fr.univtours.polytech.bookshop.model.exchangerate.ConversionRates;
import fr.univtours.polytech.bookshop.model.exchangerate.WsExchangeRate;
import fr.univtours.polytech.bookshop.model.openlibrary.Doc;
import fr.univtours.polytech.bookshop.model.openlibrary.WsOpenLibrary;
import jakarta.ejb.Stateless;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Stateless
public class ExchangeRateDAOImpl implements ExchangeRateDAO{
    private static String URL ="https://v6.exchangerate-api.com";

    public ConversionRates getConversion() {
        // Instanciation du client.
        Client client = ClientBuilder.newClient();

        // On indique l'URL du Web Service.
        WebTarget target = client.target(URL);

        // On indique le "end point" (on aurait aussi pu directement le mettre dans
        // l'URL).
        // C'est également avec cette méthode qu'on pourrait ajouter des "path
        // parameters" si besoin.
        target = target.path("/v6/4ac297b860f208ebd39c01d5/latest/EUR");

        // On appelle le WS en précisant le type de l'objet renvoyé, ici un
        // WsOpenLibrary.
        WsExchangeRate wsExchangeRate = target.request(MediaType.APPLICATION_JSON).get(WsExchangeRate.class);
        return wsExchangeRate.getConversion_rates();
    }

}