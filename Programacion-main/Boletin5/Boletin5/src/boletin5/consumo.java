package boletin5;

public class consumo {
private float km;   //número de kilometros
private float litros;  //litros
private float vMed;  //velocidade media
private float pGas;  //prezo da gasolina

public consumo(){

}

public consumo(float km,float litros,float vMed,float pGas){
    this.km = km;
    this.litros = litros;
    this.vMed = vMed;
    this.pGas = pGas;
    }


public float gettempo (){
    float tempo = km / vMed;
    return tempo;
    // tamen podo poñer 
    // return km / vMed
}

public float consumoMedio (){
    float consumo = km / litros;
    return consumo;
}

public float consumoEuros (){
    return km * pGas;
}

public void setkm (float km) {
}

public void setlitros (float litros ) {
}

public void setvMed (float vMed) {
}

public void setpGas (float pGas) {
}






















}