package Array.aplication;

import Array.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tamanho do seu Array?");
        int n = sc.nextInt();
       sc.nextLine();

        Product [] vect = new Product[n];
        for(int i=0; i< vect.length; i++){
            System.out.println("Informe nome do produto? ");
            String name = sc.nextLine();

            System.out.println("Informe preço do produto? ");
            double price = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Product(name,price);
        }

        double sum = 0.0;
        for (int i = 0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("Média de valor dos produtos é %.2f",avg);

        sc.close();
    }
}
