package boletin17;

import java.util.Scanner;

public class CuentaCorriente extends Conta{
    private final double interese = 1.5;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double interese) {

    }

    public CuentaCorriente(double interese, int numeroConta, double saldo) {
        super(numeroConta, saldo);

    }

    @Override
    public String toString() {
        return super.toString()+"CuentaCorriente{" + "interese=" + interese + '}';
    }
        
    public double getInterese() {
        return interese;
    }


    
    
}
