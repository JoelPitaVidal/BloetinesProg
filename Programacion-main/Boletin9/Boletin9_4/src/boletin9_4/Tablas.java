package boletin9_4;

import java.util.Scanner;


public class Tablas {
    
    public double tablaMult(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el número que desea multipicar: ");
    double valor = sc.nextDouble();
    double m1 = valor * 1;
    double m2 = valor * 2;
    double m3 = valor * 3;
    double m4 = valor * 4;
    double m5 = valor * 5;
    double m6 = valor * 6;
    double m7 = valor * 7;
    double m8 = valor * 8;
    double m9 = valor * 9;
    double m10 = valor * 10;
        System.out.println("La tabla de multipicar es: \n"+m1+"\n"+m2+"\n"+m3+"\n"+m4+"\n"+m5+"\n"+m6
        +"\n"+m7+"\n"+m8+"\n"+m9+"\n"+m10);
    System.exit(0);
    }
}
