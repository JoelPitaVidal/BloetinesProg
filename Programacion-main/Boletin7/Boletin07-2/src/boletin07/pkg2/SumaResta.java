
package boletin07.pkg2;

public class SumaResta {
    
    public void sumResta (short num1, short num2) {
        int suma = num1 + num2;
        
        if (num1>=num2)
            System.out.println("o resultado da resta e: "+ (num1 - num2));
        else
            System.out.println("o resultado da suma e: " + suma);
    }
}
