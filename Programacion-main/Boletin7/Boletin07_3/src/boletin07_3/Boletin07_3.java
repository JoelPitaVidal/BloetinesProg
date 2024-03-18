
package boletin07_3;

import java.util.Scanner;


public class Boletin07_3 {

    
    public static void main(String[] args) {
        MaiorMenor obx = new MaiorMenor();
        Scanner sc = new Scanner(System.in);
        System.out.println("inserte un numero");
        obx.ponerSigno(sc.nextDouble());
    }
    
}
