/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author nicol
 */
public abstract class Ed {
    protected int vetor[];
    protected int max;
    protected int cont;
    
    public Ed(int max){
        this.max = max;
        this.cont = 0;
        this.vetor = new int[max];
    }
    
    public abstract void Inserir();
    public abstract void Remover();
    
    
}
