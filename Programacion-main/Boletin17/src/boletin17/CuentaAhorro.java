package boletin17;


    import java.util.Scanner;


public class CuentaAhorro extends Conta {
    


    
    private double intVar;
    private double saldomin;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double intVar, double saldomin) {
        this.intVar = intVar;
        this.saldomin = saldomin;
    }

    public CuentaAhorro(double intVar, double saldomin, int numeroConta, double saldo) {
        super(numeroConta, saldo);
        this.intVar = intVar;
        this.saldomin = saldomin;
    }

    @Override
    public String toString() {
        return super.toString()+"CuentaAhorro{" + "intVar=" + intVar + ", saldomin=" + saldomin + '}';
    }

    public double setInteres(double intVar){
        System.out.println("Introduzca el nuevo interes Variable");
        Scanner leer = new Scanner(System.in);
        intVar = leer.nextDouble();
        return intVar;
    }
    
    public double getIntereses(){
        return intVar;
    }
    
    
}
