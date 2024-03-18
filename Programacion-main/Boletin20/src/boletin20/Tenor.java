package boletin20;





public class Tenor implements IPodeCantar{
    public void cantar(){
        System.out.println("Ahora canta un tenor");
    }
    @Override
    public void cantarConNotasMusicales(){
        System.out.println("El tenor canta notas musicales");
    }
    
}