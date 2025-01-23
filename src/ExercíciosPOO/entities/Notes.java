package entities;

public class Notes {
    public String name;
    public double nota, nota2 , nota3;

    public double some(){
        return nota + nota2 + nota3 ;
    }

    public double missing(){
        if (some() <60.00){
            return 60.00 - some();
        }else {
            return  0.0;
        }
    }

    public String toString(){
        if (some()>=60.0){
            return String.format("FINAL GRADE = %.2f\nPASS", some());

        }else {
            return String.format("FINAL GRADE = %.2f\nFAILED\nMISSING %.2f POINTS", some(),missing());
        }
    }



}
