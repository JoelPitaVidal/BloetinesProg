package boletin20;




public class Canario implements IPodeCantar{
       @Override
    public void cantar(){
        System.out.println("Ahora canta un canario");
    }
    @Override
    public void cantarConNotasMusicales(){
        System.out.println("El canario canta notas musicales");
    }
}
