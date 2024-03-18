package boletin6;

import java.util.Scanner;






public class Boletin6 {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boletin6_1 coche1= new Boletin6_1();
        System.out.println("la velocidad ");
        coche1.getVelocidade();
        System.out.println("la velocidad ="+ coche1.getVelocidade());
        coche1.acelerar(100);
        System.out.println("la aceleracion es igual a  ="+ coche1.getVelocidade());
        coche1.frenar(50);
        System.out.println("la frenada es igual a  ="+ coche1.getVelocidade());
        
    }
    
}
