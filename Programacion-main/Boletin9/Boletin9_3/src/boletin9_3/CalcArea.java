
package boletin9_3;

import java.util.Scanner;



public class CalcArea {
 public void CalcularArea(){
   
 /**   Scanner sc = new Scanner(System.in);
    
        System.out.println("inserte la base");
        double base = sc.nextDouble();
        System.out.println("Inserte la altura");
        double altura = sc.nextDouble();
   
        if(base >0 && altura >0){
        double area = base * altura;
        System.out.println("El area es igual a: "+ area);   
        }
   
        else{
        System.out.println("Los datos son incorrectos, no se permiten numeros negativos");
        } **/
        
        double base;
 
        double altura;
        do {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("inserte la base");
         base = sc.nextDouble();
        System.out.println("Inserte la altura");
         altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("El area es igual a: "+ area);   
        break;
        }while (base >0 && altura> 0);
 
        System.out.println("Los datos no deben ser negativos");
 
 }
    
}  


                    