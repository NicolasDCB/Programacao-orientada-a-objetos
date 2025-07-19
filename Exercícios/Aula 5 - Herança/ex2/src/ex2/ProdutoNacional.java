/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author nicol
 */
public class ProdutoNacional extends Produto{
    protected float taxa;
    
    public ProdutoNacional(){
        super();
        this.taxa = 0.5f;
    }
    public ProdutoNacional(String descricao, float valor){
        super(descricao,valor);
        this.taxa = 0.5f;
    } 
    
    public void Relatorio(){
        super.Relatorio();
        System.out.println("Taxa:"+taxa);
    }
}
