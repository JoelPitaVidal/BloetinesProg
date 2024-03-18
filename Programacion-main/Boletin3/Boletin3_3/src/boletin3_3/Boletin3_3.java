
package boletin3_3;

import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        int billete1,billete2,billete5,moneda,suma;
            Scanner sc = new Scanner(System.in);
                System.out.println("inserte la cantidad de billtes de 100€");
            billete1 = sc.nextInt();
                System.out.println("inserte la cantidad de billtes de 20€");
            billete2 = sc.nextInt();
                System.out.println("inserte la cantidad de billtes de 5€");
            billete5 = sc.nextInt();
                System.out.println("inserte la cantidad de monedas de 1€");
            moneda = sc.nextInt();
            suma = billete1*100 + billete2*20 + billete5*5 + moneda*1;
                System.out.println("El resultado es "+ suma + "€");
                         
    }
    
}
