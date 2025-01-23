package application;

import Util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Dolar {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double value = sc.nextDouble();

        double calc = CurrencyConverter.dollarToReal(price,value);

        System.out.printf("Amount to be paid in reais = %.2f",calc);









        sc.close();
    }
}
