/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author nicol
 */
public class Conta {
    private String nome;
    private String conta;
    private double saldo;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setConta(String conta){
        this.conta = conta;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void Sacar(double valor){
        if((saldo - valor)>=0){
             saldo = saldo - valor;
        }
        
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
}
