package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.print("name: ");
        emp.name = sc.nextLine();
        System.out.print("Gloss Salary: ");
        emp.glossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: "+ emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percent = sc.nextDouble();
        emp.increaseSalary(percent);
        System.out.println("Updated data: "+ emp);




    }
}
