
package boletin15;


public class Masaxista extends SeleccionFutbol{
     private int anosexp;
     private String tit;  

    public Masaxista() {
    }

    public Masaxista(int anosexp, String tit, String nombre, String apelidos, int edade,int id) {
        super (id,nombre,apelidos,edade);
        this.anosexp = anosexp;
        this.tit = tit;
    }

    public int getAnosexp() {
        return anosexp;
    }

    public String getTit() {
        return tit;
    }

    public void setAnosexp(int anosexp) {
        this.anosexp = anosexp;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    @Override
    public String toString() {
        return "Masaxista{" + "anosexp=" + anosexp + ", tit=" + tit + '}';
    }
     
     
    
}
