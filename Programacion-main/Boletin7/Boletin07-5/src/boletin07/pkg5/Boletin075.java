
package boletin07.pkg5;

import java.util.Scanner;

public class Boletin075 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clase5 obx = new Clase5();
        System.out.println("Introduzca tres números");
        obx.numeros(sc.nextInt(),
               
                sc.nextInt(),
                
                sc.nextInt());
    }
    
}
