package com.devlazaro;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Repositorios\\ArquivoTeste.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException("Error "+ e.getMessage());

        }
    }
}




