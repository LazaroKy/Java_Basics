package com.devlazaro;

import java.util.Scanner;

public class Main {

/*
Faça um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetição. Em seguida, ler um número inteeiro X que pertence à matriz. Para cada ocorrência de X, mostras os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo
Exemplo:
in:
3 4
10 8 15 12
21 11 23 8
14 5 13 19
8
--------------
out:
Position 0,1:
Left: 10
Right: 15
Down: 11

Position 1,3:
Left: 23
Up: 12
Down: 19

 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();
        System.out.println("----------------");
        int[][]  matriz = new int[M][N];

        for (int l = 0; l <M; l++){
            for(int c = 0; c< N; c++){
                matriz[l][c] = scan.nextInt();
            }
        }
        System.out.println("----------------");
        int value = scan.nextInt();

        for (int l = 0; l < matriz.length ; l++){
            for(int c = 0; c < (matriz.length+1); c++){
                if (matriz[l][c] == value){
                    System.out.printf("Position %d, %d: \n", l, c);
                    if (c > 0) {
                        System.out.println("Left: " + matriz[l][c-1]);
                    }
                    if (l > 0) {
                        System.out.println("Up: " + matriz[l-1][c]);
                    }
                    if (c < matriz[l].length-1) {
                        System.out.println("Right: " + matriz[l][c+1]);
                    }
                    if (l < matriz.length-1) {
                        System.out.println("Down: " + matriz[l+1][c]);
                    }
                }
            }
        }
        System.out.println("----------Finished----------");
        scan.close();
    }
}


