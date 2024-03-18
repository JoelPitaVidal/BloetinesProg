import javax.swing.JOptionPane;

public class LerDatos {

    //leer datos:

    public static int lerEnteiro(String mensaxe){

        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));

    }

    public static short lerShort(String mensaxe){

        return Short.parseShort(JOptionPane.showInputDialog(mensaxe));

    }

    public static float lerFloat(String mensaxe){

        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));

    }

    public static double lerDouble(String mensaxe){

        return Double.parseDouble(JOptionPane.showInputDialog(mensaxe));

    }

    public static long lerLong(String mensaxe){

        return Long.parseLong(JOptionPane.showInputDialog(mensaxe));

    }

    public static String lerString(String mensaxe){

        return JOptionPane.showInputDialog(mensaxe);

    }

    //leer positivos:

    public static float lerFloatPositivo(String mensaxe){

        float dato=Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        
        while (dato<=0){

            dato=Float.parseFloat(JOptionPane.showInputDialog("Introduce un valor positivo: "));
        
        }

        return dato;

    }

    public static int lerIntPositivo(String mensaxe){

        int dato=Integer.parseInt(JOptionPane.showInputDialog(mensaxe));

        while(dato<=0){

            dato=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor positivo: "));
        
        }

        return dato;

    }

    //aleatorios

    public static double darAleatorio100(){

        return Math.random()*(0-100)+100;

    }

    public static double darAleatorioEntre(double n, double m){

        return Math.random()*(n-m)+m;

    }

    //comparacion

    public static boolean compararString(String s1, String s2){

        return s1.equals(s2);

    }
    
}