
package boletin16;





public class Revistas  extends Publicación{
    double numero;

    public Revistas() {
    }

    public Revistas(double numero,int codigo, String titulo,int anop) {
        super(codigo,titulo,anop);
        this.numero = numero;
        
    }

    @Override
    public String toString() {
        return super.toString() +"revistas{" + "numero=" + numero + '}';
    }
    
    
    
}
