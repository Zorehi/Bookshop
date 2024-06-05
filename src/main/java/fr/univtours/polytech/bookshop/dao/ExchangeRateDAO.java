package fr.univtours.polytech.bookshop.dao;

import java.util.Map;

public interface ExchangeRateDAO {

    public Map<String, Double> getConversion(String currency);
}
