package fr.univtours.polytech.bookshop.business;

import fr.univtours.polytech.bookshop.dao.ExchangeRateDAO;
import fr.univtours.polytech.bookshop.model.exchangerate.Conversion_rates;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class ExchangeRateBusinessImpl implements ExchangeRateBusiness {
    @Inject
    private ExchangeRateDAO exchangeRateDAO;

    public float convertToEUR(String currency, float value){
        Conversion_rates conversionRates = exchangeRateDAO.getConversion();
        Double conversion = 1D;
        float convertedValue;
        switch (currency){
            case "GBP":
                conversion = conversionRates.getGbp();
                break;
            case "NZD":
                conversion = conversionRates.getNzd();
                break;
            case "CHF":
                conversion = conversionRates.getChf();
                break;
            case "USD":
                conversion = Double.valueOf(conversionRates.getUsd());
                break;
        }
        System.out.println(currency);
        convertedValue = (float) (value * conversion);
        return convertedValue;
    }
}
