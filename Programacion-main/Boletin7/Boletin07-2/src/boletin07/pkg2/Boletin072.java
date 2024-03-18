
package boletin07.pkg2;

import java.util.Scanner;


public class Boletin072 {

    
    
    
    public static void main(String[] args) {
        SumaResta obx = new SumaResta();
        Scanner sc = new Scanner(System.in);
        System.out.println("inserte os operandos da resta");
        obx.sumResta(sc.nextShort(), sc.nextShort());
    }
    
}

sc.nextShort()