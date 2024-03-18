package boletin08_6;

import java.util.Scanner;





public class Boletin08_6 {

    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VentaConsumo obx = new VentaConsumo();
        System.out.println("Introduzca a cantidade de vendas anuais");
        obx.ventasArtigos(sc.nextInt());
        
        
    }  
}
