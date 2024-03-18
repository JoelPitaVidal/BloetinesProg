
package boletin_19;

import java.util.Scanner;

public class ConversorTemperaturas {
    private final float graosC=80;

    public ConversorTemperaturas() {
    }

    public float getGraosC() {
        return graosC;
    }

    public float centigradosAFharenheit(float graosC){
        float graosF=(float) (9/5*graosC+32.4);
        return graosF;
    }
    public float centigradosAReamur(float graosC){
        float graosR=(float) (0.8*graosC);
        return graosR;
    } 
}
