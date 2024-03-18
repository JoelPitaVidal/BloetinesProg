
package boletin6;


public class Boletin6_1 {
       private int velocidade ;
       
       
    public Boletin6_1(){
        velocidade = 0;
    }
    public int getVelocidade (){
        return velocidade;
    }
    
    public void acelerar (int valor) {
            velocidade += valor;
        }
    public void frenar (int menos){
            velocidade -= menos;
    }
}