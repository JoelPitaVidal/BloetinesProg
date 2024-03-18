
package boletin08_6;






public class VentaConsumo {
    
    
    public void ventasArtigos (int vendas){

    if (vendas<=100)
            System.out.println("Artigo de consumo:baixo");
    
    
    if (vendas >100&&vendas<= 500)
            System.out.println("artigo de consumo:medio");
    
    if (vendas>500&&vendas<=1000)
            System.out.println("artigo de consumo:alto");
    if (vendas>1000)
            System.out.println("artigo de consumo:primeira necesidade");
     
    } 
}
