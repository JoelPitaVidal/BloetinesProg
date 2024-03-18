package libro;


public class Libro1 {
    private String titulo;
    private String autor;
    private int ano;
    private int numPaginas;
    private float valoracion;

public Libro1 (){

    
    }
   public Libro1 (String ti, String au, int no, short np){
       titulo = ti; 
       autor = au;
       ano = no;
       numPaginas = np;
    }
    
   public void settitulo  (String ti) {
         titulo = ti;
     }
    public String gettitulo  (String ti) {
         return  titulo;
     } 
   public void setautor  (String au) {
         autor = au;
     }
    public String getautor  (String au) {
         return  autor;
     }
      public void setano  (int no) {
         ano = no;
     }
    public int getano  (int no) {
         return  ano;
     }
    public void setnumPaginas  (int np) {
         numPaginas = np;
     }
    public int getpaginas  (int np) {
         return  numPaginas;
     }

    void numPaginas(short s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
         
    
    
    
    
    
    
    
    
    
    
}