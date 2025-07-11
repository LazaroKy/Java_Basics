package com.devlazaro;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String strPath = scan.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        if (folders == null){
            System.out.println("No folders found");
        } else {
            for(File folder : folders){
                System.out.println(folder);
            }
        }

        System.out.println();

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        if (files == null){
            System.out.println("No files found");
        } else {
            for (File file : files){
                System.out.println(file);
            }
        }

        System.out.println();

        boolean sucess = new File(strPath +"\\subdir").mkdir();
        System.out.println("Directory created sucessfully "+sucess);

        System.out.println();

        System.out.println("Infos{Path: " +path.getPath()+", Parent: "+ path.getParent()+ ", Name: "+ path.getName());
        scan.close();

    }
}