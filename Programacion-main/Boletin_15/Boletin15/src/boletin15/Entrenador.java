package boletin15;


public class Entrenador extends SeleccionFutbol{
     private int edade;
     private String ident;   

    public Entrenador() {
    }
    public Entrenador(int edade, String ident,int id,String nombre, String apelidos,int SeleccionFutbol.edade){
        super (id,nombre,apelidos);
        this.edade = edade;
        this.ident = ident;
    }

    public int getEdade() {
        return edade;
    }

    public String getIdent() {
        return ident;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "edade=" + edade + ", ident=" + ident + '}';
    }
     
     
}
