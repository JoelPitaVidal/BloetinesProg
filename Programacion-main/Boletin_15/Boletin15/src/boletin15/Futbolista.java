package boletin15;


public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;
    
    
    public Futbolista(){
    
    } 
    
      public Futbolista(int dorsal, String demarcacion,String nombre, String apelidos, int edade,int id){
          super (id,nombre,apelidos,edade);
          this.dorsal=dorsal;
          this.demarcacion=demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
 
    
      
}

