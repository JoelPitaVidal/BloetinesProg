package boletin07_1;

import java.util.Scanner;


public class Boletin07_1 {

    
    
    
    public static void main(String[] args) {
       NumeroPositivo obx = new NumeroPositivo();
       Scanner sc = new Scanner(System.in);
       System.out.println("inserte un número");
       obx.numPos(sc.nextInt());
    }
    
}
