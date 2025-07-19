/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author nicol
 */
public class Fila extends Ed{
    
    public Fila(int max){
        super(max);
    }
    
    @Override
    public void Inserir(int valor){
        if(cont<max){
            vetor[cont] = valor;
            cont++;
        }
        else{
            System.out.println("Fila cheia");
        }
    }
    
    @Override
    public void Remover(){
        if(cont>0){
            for(int i=0;i<cont;i++){
                vetor[i] = vetor[i+1];
            }
        }
        else{
            System.out.println("Fila vazia");
        }
    }
}
