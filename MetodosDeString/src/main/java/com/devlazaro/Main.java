package com.devlazaro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Bem-vindo! Essa aplicação mostra os métodos de String aplicadas na frase: ");
        String frase = "Desenvolvedor de Java com Framework de Spring ";
        System.out.println(frase);
        System.out.println("----------------------------");

        String s01 = frase.toLowerCase();
        String s02 = frase.toUpperCase();
        String s03 = frase.trim();
        String s04 = frase.substring(1);
        String s05 = frase.substring(0, 21);
        String s06 = frase.replace('e', 'E');
        String s07 = frase.replace("or", "OR");
        int i = frase.indexOf("rk");
        int j = frase.lastIndexOf("or");
        System.out.println("Mensagem inserida:  "+ frase );
        System.out.println("Método toLowerCase:  "+ s01 );
        System.out.println("Método toUpperCase:  "+ s02 );
        System.out.println("Método trim:  "+ s03 );
        System.out.println("Método substring(1):  "+ s04 );
        System.out.println("Método substring(0, 21):  "+ s05 );
        System.out.println("Método replace('e', 'E'):  "+ s06 );
        System.out.println("Método replace('or', 'OR'):  "+ s07 );
        System.out.println("Método indexOf('rk'): " + i);
        System.out.println("Método lastIndexOf('or'): " + j);

        System.out.println("----------------------------");

        System.out.println(frase);

        System.out.println("Array de String - Método Split ");
        String fraseParaSplitar = "Bom dia Leo";

        System.out.println("A Frase que iremos usar é: "+ fraseParaSplitar);
        System.out.println("----------------------------");

        String[] arrayDeString = fraseParaSplitar.split(" ");
        String word1 = arrayDeString[0];
        String word2 = arrayDeString[1];
        String word3 = arrayDeString[2];
        System.out.println("Array da String dividida pelos espaços: ");
        System.out.println("Posição 3: "+word3);
        System.out.println("Posição 1: "+word1);
        System.out.println("Posição 2: "+word2);

        System.out.println("----------------------------");

        System.out.println("Bônus, Métodos do StringBuilder");
        StringBuilder frase2 = new StringBuilder("Pedro é rápido");
        String frase3 = " e feliz";
        System.out.println("A frase principal será: "+ frase2);
        System.out.println("----------------------------");
        frase2.append(frase3);
        System.out.println("Método Append(' e feliz'): " +frase2);
        frase2.insert(22, ", isso é bom!");
        System.out.println("Método insert(22, ',isso é bom'): " +frase2);
        frase2.delete(14, 22);
        System.out.println("Método delete(14,22): " +frase2);
        frase2.reverse();
        System.out.println("Método reverse: "+ frase2);
        System.out.println("----------------------------");

    }
}