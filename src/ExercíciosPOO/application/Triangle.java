package application;
import java.util.Scanner;
import java.util.Locale;
import entities.ProductT;

public class Triangle {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        ProductT rect = new ProductT();
        System.out.println("Enter rectangle width and height: ");
        rect.heigth = sc.nextDouble();
        rect.width = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n",rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n",rect.diagonal());



    }


}
