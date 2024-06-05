package fr.univtours.polytech.bookshop.business;

import fr.univtours.polytech.bookshop.dao.ExchangeRateDAO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.Map;

@Stateless
public class ExchangeRateBusinessImpl implements ExchangeRateBusiness {
    @Inject
    private ExchangeRateDAO exchangeRateDAO;

    public Map<String, Double> getConversionRate(String currency){
        return exchangeRateDAO.getConversion(currency);
    }
}
