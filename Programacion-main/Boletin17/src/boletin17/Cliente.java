package boletin17;

import java.util.Scanner;


public class Cliente extends Conta{
    private String nome;
    private String apelidos;
    private String NIF;

    public Cliente() {
    }
    
    public Cliente(String nome, String apelidos, String NIF,int numeroConta,double saldo) {
        super(numeroConta,saldo);
        this.nome = nome;
        this.apelidos = apelidos;
        this.NIF = NIF;  
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", apelidos=" + apelidos + ", NIF=" + NIF + '}';
    }
    
    Scanner sc=new Scanner(System.in);
    
    public String getNome() {
        nome=sc.nextLine();
        return nome;
    }

    public String getApelidos() {
        apelidos=sc.nextLine();
        return apelidos;
    }

    public String getNIF() {
        NIF=sc.nextLine();
        return NIF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
  
    
  
}
