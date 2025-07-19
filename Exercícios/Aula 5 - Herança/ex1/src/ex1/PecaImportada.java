/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
public class PecaImportada extends Pecas{
    protected double importacao;
    protected double frete;
    
    public PecaImportada(){
        super();
        this.importacao = 0;
        this.frete = 0;
    }
    
     public PecaImportada(String nome, double custo, double lucro, double importacao, double frete){
        super(nome,custo,lucro);
        this.importacao = importacao;
        this.frete = frete  ;
    } 

    public double getImportacao() {
        return importacao;
    }

    public void setImportacao(double importacao) {
        this.importacao = importacao;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
     
    @Override
     public double Preco(){
         double p = super.Preco();
         p = p + importacao + frete;
         
         return p;
     }
     
    @Override
     public void Exibir(){
         super.Exibir();
         System.out.println("Taxa de importação:"+importacao);
         System.out.println("Taxa de frete:"+frete);
     }
}
