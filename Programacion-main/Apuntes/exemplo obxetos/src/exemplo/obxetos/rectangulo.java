
package exemplo.obxetos;


public class rectangulo {
    private float base ;
    private float altura;
    private float al;
    private float ba;
    //constructores
    //constructore por defecto
    // inicializa las variables igualandolas a 0 aunque no se especifique
    
    //construtor parametrizado o con parametros 
      public rectangulo(float ba, float alt){
      base = ba;
      altura = alt;
      }
    // e o constructor por defecto porque o da java automaticamente, se hay outro java xa non o da, 
    public rectangulo (){
    
    
    
    }
    //metodos de acceso
    public void darValorBase (float ba) {
        base =ba;
    }
    public float devolverValorBase(){
        return base;
    }
    public void darValorAltura (float alt) {
        altura =alt;
    }
    public float devolverValorAltura(){
        return altura;
    }   
    public void calcularArea(float ba,float alt){
   
    float area = ba*alt;
    
    System.out.println("area es igual a "+ area);
    
}
   public float calcularPerimetro(float ba,float alt){
    float per = 2*ba+2*alt;
    return per;
}
}


