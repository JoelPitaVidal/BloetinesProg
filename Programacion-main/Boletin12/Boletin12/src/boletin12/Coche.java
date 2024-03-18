package boletin12;

import javax.swing.JOptionPane;

public class Coche {
    
double precio;
int garaje=0;
float marca;


public void coche (){
}

public void coche (double precio,int garaje){
    this.precio=precio;
    this.garaje = 0;
    
    do{
    
     JOptionPane.showMessageDialog( null,  "PLAZAS DISPOÑIBLES");
     double matricula= Double.parseDouble(JOptionPane.showInputDialog("introduzca a matricula"));
     marca = Float.parseFloat(JOptionPane.showInputDialog("introduzca a matricula"));
     double tempo= Double.parseDouble(JOptionPane.showInputDialog("introduzca as horas de estancia"));
     
     double pago;
     
     if(tempo<=3)
         pago=1.5;
     else
         pago=(((tempo-3)*0.20)+1.5);
  
    double importe = Double.parseDouble(JOptionPane.showInputDialog("introduzca o importe"));     
     
    double vuelta = importe-pago;
    
    JOptionPane.showMessageDialog( null,  "Se devolverán: "+ vuelta);
    
    JOptionPane.showMessageDialog( null,  
    "FACTURA: \n "
    + "MATRICULA = "+matricula+"\n "
    + "TIEMPO: "+tempo+"\n "
    + "PAGO: "+pago+"\n "
    + "IMPORTE: "+importe+"\n"
    + "Vuelta:; "+vuelta+"\n "
    + "GRAZAS POR USAR O NOSO APARCADOIRO");
    
    
    }while(garaje<5);
    
     JOptionPane.showMessageDialog( null,  "GARAXE COMPLETO");
    
}
    
}
