package fr.univtours.polytech.bookshop.dao;

import fr.univtours.polytech.bookshop.model.exchangerate.ConversionRates;

public interface ExchangeRateDAO {

    public ConversionRates getConversion();
}
