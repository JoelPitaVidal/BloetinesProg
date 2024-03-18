
package boletin24;

import Libreria.*;

import datos.LerDatos;

public class Menu {

   static Libreria libreria=new Libreria();

   public static void pintarMenu(){

        int opcion=LerDatos.lerEnteiro("Elije una opcion: "

                + "\n1) dar libro de alta"
                + "\n2) vender libro"
                + "\n3) realizar consulta"
                + "\n4) salir");

        switch(opcion){

            case 1:

                libreria.añadirLibro();

                pintarMenu();

                break;

            case 2:

                libreria.venderLibros();

                pintarMenu();

                break;

            case 3:

                libreria.consultarUnLibro();

                pintarMenu();

                break;

            case 4:

                break;

            default:

                pintarMenu();

                break;
                
        }
    }
}
