package com.devlazaro;

import com.devlazaro.entiteis.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

//Faça um programa para ler o caminho de um arquivo.csv contendo os dados de itens vendidos. Cada item possui um nome, preço unitário e quantidade, separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv", localizado em uma subpasta chamada "out" a partir da pasta original do arquivo de origem, contendo apenas o nome e o valor total para aquele item (preço unitário multiplicado pela quantidade).

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the path:");
        String textPath = scan.nextLine();

        File pathIn = new File(textPath);

        try(BufferedReader br = new BufferedReader(new FileReader(pathIn))){
            String line = br.readLine();

            List<Item> itens = new ArrayList<>();
            while(line != null){
                String[] infos = line.split(",");
                Item item = new Item(infos[0],Double.parseDouble(infos[1]),Integer.parseInt(infos[2]));

                itens.add(item);

                line = br.readLine();
            }

            File outDir = new File(pathIn.getParent() + "\\out");
            boolean success = outDir.mkdir();
            System.out.println("Status Created: " + success);

            String pathOut = pathIn.getParent()+"\\out\\summary.csv";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))){

                for (Item itemLine : itens){
                    bw.write(itemLine.getName()+","+ String.format("%.2f",itemLine.getTotalPrice(itemLine.getPrice(), itemLine.getQuantity())));
                    bw.newLine();
                }

                System.out.println("Task done");

            } catch (IOException e){
                throw new RuntimeException("Error writting file: "+ e.getMessage());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error: "+e.getMessage());
        }


    }
}