/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author nicol
 */
public class Produto {
    protected String descricao;
    protected float valor;
    protected float imposto;
    
    public Produto(){
        this.descricao = "Não informado";
        this.valor = 0;
        this.imposto = 0.1f;
    }
     public Produto(String descricao, float valor){
        this.descricao = descricao;
        this.valor = valor;
         this.imposto = 0.1f;       
    }
    
     public void Relatorio(){
         System.out.println("Descrição do produto:"+descricao);
         System.out.println("Valor:"+valor);
         System.out.println("Imposto:"+imposto);
     }
}
