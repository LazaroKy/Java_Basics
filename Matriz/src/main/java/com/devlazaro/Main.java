package com.devlazaro;

import com.devlazaro.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //Para definir o ponto (.) como separador decimal e a virgula (,) para os milhares
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Product[] produtos = new Product[n];

        for(int i = 0; i < produtos.length; i++){
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();

            produtos[i]= new Product(name, price);
        }

        double sum = 0;
        for (int i = 0; i < produtos.length; i++){
            sum += produtos[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("Average price = %.2f%n",avg);

    }
}