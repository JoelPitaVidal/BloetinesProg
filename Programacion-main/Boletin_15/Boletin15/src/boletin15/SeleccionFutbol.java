
package boletin15;


public class SeleccionFutbol {
    int id;
    String nombre;
    String apelidos;
    int edade;
    
    Masaxista obm = new Masaxista();
    Entrenador obe = new Entrenador();
    Futbolista obf = new Futbolista();

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apelidos, int edade) {
        this.id = id;
        this.nombre = nombre;
        this.apelidos = apelidos;
        this.edade = edade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public void setObm(Masaxista obm) {
        this.obm = obm;
    }

    public void setObe(Entrenador obe) {
        this.obe = obe;
    }

    public void setObf(Futbolista obf) {
        this.obf = obf;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelidos() {
        return apelidos;
    }

    public int getEdade() {
        return edade;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", nombre=" + nombre + ", apelidos=" + apelidos + ", edade=" + edade + ", obm=" + obm + ", obe=" + obe + ", obf=" + obf + '}';
    }
    
   
    
}
