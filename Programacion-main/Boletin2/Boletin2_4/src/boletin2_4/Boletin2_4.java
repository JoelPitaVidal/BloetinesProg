
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    
   public static void main(String[] args) {
            double n1,n2,suma,resta,mult,div;
            Scanner sc = new Scanner(System.in);
                System.out.println("inserte el numero 1");
           n1 = sc.nextFloat();
                System.out.println("inserte el numero 2");
            n2 = sc.nextFloat();
             suma = n1 + n2;
             resta = n1 - n2;
             mult = n1 * n2;
             div = n1 / n2;
                System.out.println("El resultado de la division es " + div +"\nEl resultado de la multiplicacion es " + mult  + "\nEl resultado de la resta es " + resta + "\nEl resultado de la suma es " + suma);
                
                
                
    }
    
}


