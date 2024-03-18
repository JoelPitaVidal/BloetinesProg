
package boletin07.pkg4;

import javax.swing.JOptionPane;

public class Clase4 {
    public void datosPersonas() {
        String nombre1=JOptionPane.showInputDialog("Escribe el nombre de la primera persona 1");
                double peso1=Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso de la persona 1"));
         String nombre2=JOptionPane.showInputDialog("Escribe el nombre de la primera persona 2");
                double peso2=Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso de la persona 2"));
                
                
                
         if (peso1>peso2)
             JOptionPane.showMessageDialog(parentComponent, peso2);
    }
}

