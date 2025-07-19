/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author nicol
 */
public class Pilha extends Ed {
    
    public Pilha(int max){
        super(max);
    }
    
    @Override
    public void Inserir(int valor){
        if(cont<max){
            vetor[cont] = valor;
            cont++;
        }
        
        else{
            System.out.println("Pilha cheia");
        }
    }
    
    @Override
    public void Remover(){
        if(cont>0){
         cont--;           
        }
        else{
            System.out.println("Pilha vazia");
        }
    }
}
