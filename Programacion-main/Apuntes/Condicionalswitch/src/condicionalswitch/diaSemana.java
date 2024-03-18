package condicionalswitch;

import javax.swing.JOptionPane;



public class diaSemana {
    
    public void verDiaSemana (){
    
        int dia = Integer.parseInt(JOptionpane.showInputDiaLog("Teclea el numero de día"));
        switch (dia){
        
            case 1: System.out.println("Lunes");
                break;
            case 2: System.out.println("martes");
                break;
            case 3: System.out.println("miercoles");
                break;
            case 4: System.out.println("jueves");
                break;
            case 5: System.out.println("viernes");
                break;
            case 6: System.out.println("sabado");
                break;
            case 7: System.out.println("domingo");
                break;
            default: System.out.println("Opción Incorrecta");
        
        
        
        
        }
    
    }
    
}
