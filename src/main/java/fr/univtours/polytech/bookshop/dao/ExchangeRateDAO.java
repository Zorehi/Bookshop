package fr.univtours.polytech.bookshop.dao;

import fr.univtours.polytech.bookshop.model.exchangerate.Conversion_rates;

public interface ExchangeRateDAO {

    public Conversion_rates getConversion();
}
