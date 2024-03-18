package boletin16;


public class Publicación {
    int codigo;
    String titulo;
    int anop;

    public Publicación() {
    }

    public Publicación(int codigo, String titulo, int anop) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anop = anop;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnop() {
        return anop;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnop(int anop) {
        this.anop = anop;
    }
    
    @Override
    public String toString() {
        return "Publicaci\u00f3n{" + "codigo=" + codigo + ", titulo=" + titulo + ", anop=" + anop + '}';
    }

    
    
}
