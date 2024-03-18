package boletin17;

import java.util.Scanner;


public class Boletin17 {

   
    public static void main(String[] args) {
        int i = 0;
        
        Conta obc = new Conta(); 
        Cliente obi = new Cliente();
        CuentaCorriente obf = new CuentaCorriente();
        CuentaAhorro obb = new CuentaAhorro();
        
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del cliente");
            obi.getNome();
            System.out.println("Ingrese los apellidos del cliente");
            obi.getApelidos();
            System.out.println("Ingrese el NIF del cliente");
            obi.getNIF();
            System.out.println("Ingrese un número de cuenta");
            obc.getNumeroConta();
            System.out.println("Introduzca el saldo del que dispone");
            obc.getSaldo();
            System.out.println("Que tipo de cuenta desea crear,ahorro (pulse 0) o corriente (pulse 1)");
            int respuesta = sc.nextInt();
            
            if(respuesta==1){
                System.out.println("Su cuenta tendrá los siguientes intereses");
                obf.getInterese();
            }
            else if(respuesta==0){
                System.out.println("Su cuenta generará los siguientes intereses");
                obb.getIntereses();
            }
          
            i++;
        }while (i < 5);
    }
    
}
