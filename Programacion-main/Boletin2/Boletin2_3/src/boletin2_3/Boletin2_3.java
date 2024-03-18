package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        float euros,conver,dolar; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la cantidad en euros: ");
            euros = sc.nextFloat();
        System.out.println("Inserte el factor de convesrión: ");
            conver = sc.nextFloat();
        dolar = euros * conver;
             System.out.println("La cantidad en dolares es: " + dolar + " dolares");
     
             //tamen
             
            // Scanner sc = new Scanner(System.in);
             //float euros = sc.nextFloat();
            // float cambio = sc.nextFloat();
             //System.out.println(euros +"euros = " + (euros*cambio)+dolares;
             
             
             
    }
}