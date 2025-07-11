package com.devlazaro;

import com.devlazaro.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

// import static com.devlazaro.util.Calculator.*;
import static com.devlazaro.util.Calculator.PI;
import static com.devlazaro.util.Calculator.circumference;
import static com.devlazaro.util.Calculator.volume;

public class Program {

    //private static final double PI = 3.14159;

    public static void main(String[] args) {
        //Uso do Final para determinar como uma constante, valor que não muda
        //Por padrão as constantes possuem nomes maiúsculos
        Locale.setDefault(Locale.US); //Para definir o ponto (.) como separador decimal e a virgula (,) para os milhares
        Scanner scan = new Scanner(System.in);

        //Calculator calc = new Calculator();

        System.out.println("Enter Radius: ");
        double radius = scan.nextDouble();

                    //= calc.circumference(radius);
        //double c = circumference(radius);
                   //=calc.volume(radius);
        //double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference(radius));  //c
        System.out.printf("Volume: %.2f%n", volume(radius)); //v
        System.out.printf("PI Value: %.2f%n", PI);

        scan.close();
    }

//    private static double circumference(double radius) {
//        return 2.0 * PI * radius;
//    }
//
//    private static double volume(double radius) {
//        return 4.0 * PI * radius * radius * radius / 3;
//    }

}