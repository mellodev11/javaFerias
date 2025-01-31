package application;

import entities.Dados;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);
        double balance = 0;
        Dados dados;
        if (resp == 'y'){
            System.out.print("Enter initial deposit value: ");
             balance = sc.nextDouble();
             dados = new Dados(name,accountNumber,balance);
        }
        else {
            dados = new Dados(name,accountNumber);
        }


        System.out.println();
        System.out.println("Account data:");
        System.out.println(dados);
        System.out.println();


        System.out.print("Enter deposit a value:");
        balance = sc.nextDouble();
        dados.deposit(balance);
        System.out.println("Updated account data:");
        System.out.println(dados);
        System.out.println();

        System.out.print("Enter a withdraw  value:");
        System.out.println("Updated account data:");
        balance = sc.nextDouble();
        if(balance >0){
            dados.withdraw(balance);
            System.out.println(dados);
        }else {
            System.out.println("Invalid withdrawal amount.");
        }

        sc.close();
    }
}