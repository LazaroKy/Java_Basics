package com.devlazaro;

import com.devlazaro.enteties.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("How many employees will be registered? ");
        int numberOfEmployees = scan.nextInt();
        System.out.println();
        List<Employees> listEmployees = new ArrayList<>();

        for(int i = 0; i< numberOfEmployees; i++){
            System.out.println("Employee #" + (i + 1) +":");
            System.out.println("Id: ");
            long id = scan.nextLong();

            System.out.println("Name: ");
            scan.nextLine();
            String name = scan.nextLine();

            System.out.println("Salary: ");
            double salary = scan.nextDouble();

            Employees employee = new Employees(id, name, salary);
            listEmployees.add(employee);
            System.out.println();
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        long idEmployee = scan.nextLong();

        Employees employeeMatch = listEmployees.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

        if (employeeMatch == null){
            System.out.println("This id does not exists!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = scan.nextDouble();
            employeeMatch.setSalary(increaseSalary(percentage, employeeMatch.getSalary()));
        }

        System.out.println();
        //Poderia usar o toString() e enviar o objeto
        System.out.println("List of employees: ");
            for( Employees employee : listEmployees) {
                System.out.printf(employee.getId() + ", " + employee.getName() + ", %.2f%n \n", employee.getSalary());
            }
            scan.close();
    }

    private static Double increaseSalary(double percentage, double salary){
        percentage = 1 + percentage/100;
        return salary * percentage;
    }
}