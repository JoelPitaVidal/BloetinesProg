package boletin_19;

import javax.swing.JOptionPane;

public class TemperaturaErradaExcepcion {

        public void Excepciones (){
        ConversorTemperaturas ob = new ConversorTemperaturas();

        boolean entrada=false;
        while (entrada != true){
            try {
                int graosC = Integer.parseInt(JOptionPane.showInputDialog("Graos centígrados"));
                if(graosC<80){
                    throw new IllegalArgumentException("Mal");
                }
                JOptionPane.showMessageDialog(null, "Temperatura en Cº: "+graosC+"\nTemperatura en Fº:"+ob.centigradosAFharenheit(graosC)+"\nTemperatura en Reamur: "+ob.centigradosAReamur(graosC));
                entrada=true;
            }
            catch(NumberFormatException d){
                JOptionPane.showMessageDialog(null, "Tienes que poner la temperatura en número :|");
            }
            catch(IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, "Tienes que poner una temperatura mayor");
                    }
            finally{
                JOptionPane.showMessageDialog(null, "Gracias por usar el programa :D");
            }

        }
    }
    
}
