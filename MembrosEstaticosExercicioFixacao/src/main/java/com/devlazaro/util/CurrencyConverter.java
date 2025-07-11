package com.devlazaro.util;

public class CurrencyConverter {

    private static final double FEE_IFO = 1.06;

    public static double priceWillPayWithFee (double priceDollar, double dollarsBought){
        return dollarsBought * priceDollar * FEE_IFO;
    }

}
