package com.devlazaro;

import java.util.Locale;
import java.util.Scanner;

import static com.devlazaro.util.CurrencyConverter.priceWillPayWithFee;

public class Broker {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double priceDollar = scan.nextDouble();

        System.out.println("How many dollars will be bougth?");
        double dollarsBought = scan.nextDouble();


        double priceReal = priceWillPayWithFee(priceDollar, dollarsBought);
        System.out.printf("Ammout to be paid in reais = %.2f%n", priceReal);

        scan.close();
    }
}