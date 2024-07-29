package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType targetCurrency) {
        return targetCurrency.getRate() / CurrencyType.getTypeOfCurrency(this).getRate();
    }

    CurrencyType getType();
}
