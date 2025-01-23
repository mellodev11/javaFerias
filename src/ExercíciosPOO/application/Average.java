package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Notes;

public class Average {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notes notes = new Notes();

        notes.name = sc.nextLine();
        notes.nota = sc.nextDouble();
        notes.nota2 = sc.nextDouble();
        notes.nota3 = sc.nextDouble();

        System.out.println(notes);

    sc.close();
    }
}
