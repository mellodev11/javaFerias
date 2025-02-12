package Array;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tamanho do array");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("digite o valor do array");
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("Média dos valores do array %.2f", avg);


        sc.close();
    }
}
