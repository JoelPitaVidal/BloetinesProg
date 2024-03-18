
package boletin16;

public class Libros  extends Publicación{
    float prestado;

    public Libros() {
    }

    public Libros(float prestado,int codigo, String titulo,int anop) {
        super(codigo,titulo,anop);
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "Libros{" + "prestado=" + prestado + '}';
    }

 

    
}
