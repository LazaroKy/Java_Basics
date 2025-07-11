import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exploring list methods");

        List<String> listOfString = new ArrayList<>();
        listOfString.add("João");
        listOfString.add("Júlia");
        listOfString.add("Ana");
        listOfString.add("Bia");
        listOfString.add("Marinho");
        listOfString.add("Anderson");
        listOfString.add("Marcela");
        listOfString.add("Biel");

        System.out.println("Created a list of Strings:");
        System.out.print(listOfString);
        System.out.println("\n-------------------------------");

        int listSize = listOfString.size();
        System.out.println("List size: "+ listSize);
        System.out.println("Method used: list.size()");

        System.out.println("-------------------------------");
        int indexOfStringBia = listOfString.indexOf("Bia");
        System.out.println("Index of 'bia': "+ indexOfStringBia);
        int indexOfAMissingString = listOfString.indexOf("Pietro");
        System.out.println("Index of 'Pietro': "+ indexOfAMissingString);
        System.out.println("When a item not existing in list the value of index is negative");
        System.out.println("Method used: list.indexOf(string)");
        System.out.println("-------------------------------");

        listOfString.add("Arthur");
        System.out.println("Added 'Arthur' in list.");
        System.out.println(listOfString);
        listOfString.add(2,"Neto");
        System.out.println("Added 'Neto' after index 2 in list.");
        System.out.println(listOfString);
        System.out.println("Method used: list.add(string). Add item in the last index");
        System.out.println("Method used: list.add(index,string). Add item after index");
        System.out.println("-------------------------------");

        listOfString.removeLast();
        System.out.println("Removed item at last index");
        listOfString.remove("Neto");
        System.out.println("Removed 'Neto");

        System.out.println("Method used: list.removeLast()");
        System.out.println("Method used: list.remove('string' || index). Remove item that match with the arg string, and can remove item at index arg");
        System.out.println("-------------------------------");

        
    }
}
