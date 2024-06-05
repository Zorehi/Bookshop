package fr.univtours.polytech.bookshop.business;

import java.util.Map;

public interface ExchangeRateBusiness {
    public Map<String, Double> getConversionRate(String currency);
}
