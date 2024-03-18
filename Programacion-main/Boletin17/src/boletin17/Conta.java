package boletin17;

import java.util.Scanner;


public class Conta {
    
       private int numeroConta;
       private double saldo;
       private Cliente cliente;

    public Conta() {
    }
       
       
    public Conta(int numeroConta,double saldo) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.cliente=cliente;
    }
    Scanner sc = new Scanner(System.in);
    public int getNumeroConta() {
        numeroConta=sc.nextInt();
        return numeroConta;
    }

    public double getSaldo() {
        saldo=sc.nextInt();
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
       public double ingresar(double saldo){
       double ingresar=sc.nextInt();
       saldo=ingresar+saldo;
       return saldo;
       }
         public double retirar(double saldo){
       double retirar=sc.nextInt();
       saldo=saldo-retirar;
       return saldo;
         }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
       
       
       
       
}
