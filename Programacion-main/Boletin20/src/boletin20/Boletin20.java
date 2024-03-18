package boletin20;


public class Boletin20 {

 
    public static void main(String[] args) {
        galo obG= new galo();
        Persoa obP= new Persoa();
        Canario obC= new Canario();
        Tenor obT= new Tenor();
        obG.cantar();
        obP.cantarConNotasMusicales();
        obC.cantar();
        obT.cantar();
    }
    
}
