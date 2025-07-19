/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author nicol
 */
public class Conta {
    private String titular;
    private double saldo;
    private double limite;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public Conta(){
    this.titular = "Não informado";
    this.saldo = 0;
    this.limite = 0;
}
    
    public Conta(String titular, double saldo, double limite){
        this.limite = limite;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void Exibir(){
        System.out.println("Titular:"+titular);
        System.out.println("Saldo:"+saldo);
        System.out.println("Limite:"+limite);
    }
    
    public void Depositar(double valor){
        if(valor >0){
            saldo = saldo + valor;
        }
    }
    
    public void Saque(double valor){
        if((saldo + limite) - valor >=0){
            saldo = saldo - valor;
            System.out.println("Saldo:"+saldo);
        }
        
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    
}
