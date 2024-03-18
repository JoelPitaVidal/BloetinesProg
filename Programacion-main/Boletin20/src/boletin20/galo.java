
package boletin20;


public class galo implements IPodeCantar{
    @Override
    public void cantar(){
        System.out.println("Ahora canta un gallo");
    }
    @Override
    public void cantarConNotasMusicales(){
        System.out.println("El gallo canta notas musicales");
    }
}