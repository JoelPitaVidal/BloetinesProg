
package exemplocondicionais;

import java.util.Scanner;


public class ExemploCondicionais {

    
    public static void main(String[] args) {
      //CondicionalSimple obx = new CondicionalSimple();
     // Scanner sc = new Scanner(System.in);
     //   System.out.println("Inserte a sua idade");
    //    int edad = sc.nextInt();
   //     obx.MaiorIdade(edad);
        
      CondicionalDoble obx2 = new CondicionalDoble(); 
       Scanner sc2 = new Scanner(System.in);
       System.out.println("inserte os dous numeros");
       obx2.verNumeros(sc2.nextInt(), sc2.nextInt());
    }
}
