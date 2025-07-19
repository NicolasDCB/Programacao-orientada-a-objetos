/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author nicol
 */
public class Conta {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    private String titular;
    private String numero;
    private double saldo;
    private double limite;
    
    public Conta(){
        this.titular = "Não  informado";
        this.numero = "0000000";
        this.saldo = 0;
        this.limite = 0;
    }
    
        public Conta(String titular, String numero, double saldo, double limite){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
    

    public void Exibir(){
        System.out.println("Titular:"+titular);
        System.out.println("Numero da conta:"+numero);
        System.out.println("Saldo:"+saldo);
        System.out.println("Limite:"+limite);
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public void Saque(double valor){
        if((saldo + limite) - valor >=0){
            saldo = saldo - valor;
            System.out.println("Saldo:"+saldo);
        }
    }
}

