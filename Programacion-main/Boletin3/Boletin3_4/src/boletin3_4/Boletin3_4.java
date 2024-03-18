
package boletin3_4;

import java.util.Scanner;

public class Boletin3_4 {

  
    public static void main(String[] args) {
        int dt,b1,b2,b5,m1;
            Scanner sc = new Scanner(System.in);
                System.out.println("inserte la cantidad total de dinero");
            dt = (int) sc.nextInt();
            b1=dt/100;
            dt%= 100;
              System.out.println("billetes de 100 " + b1);
            b2=dt/20;
            dt%= 20;
              System.out.println("billetes de 20: " + b2);
            b5=dt/5;
            dt%= 5;
              System.out.println("billetes de 5: " + b5);
            m1=dt/1;
            dt%= 1;
              System.out.println("monedas de euro: " + m1);
            
    }
    
}
