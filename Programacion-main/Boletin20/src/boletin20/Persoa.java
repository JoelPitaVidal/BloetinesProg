package boletin20;


public class Persoa implements IPodeCantar{
    @Override
    public void cantar(){
        System.out.println("Ahora canta una persona");
    }
    @Override
    public void cantarConNotasMusicales(){
        System.out.println("La persona canta notas musicales");
    }
}
