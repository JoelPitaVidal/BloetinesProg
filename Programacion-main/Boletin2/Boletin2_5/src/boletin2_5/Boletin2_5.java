
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("introduzca las millas: ");
            double millas = sc.nextDouble();
            final int M = 1852; //asi se establece una constante
            double metros = millas * M;//asi se establecen las variables desde ahora
            System.out.println(millas+"millas = " + metros + "metros");
                    
    }
}
