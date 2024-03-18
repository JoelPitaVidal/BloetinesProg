
package exemjoptionpane;

import javax.swing.JOptionPane;

public class ExemJoptionPane {


    public static void main(String[] args) {
        // pedir datos
        float dato =Float.parseFloat(JOptionPane.showInputDialog("teclea un mensaje"));
        //System.out.println(dato);
        JOptionPane.showMessageDialog(null,"o valor e : "+ dato);
    }
    
}
