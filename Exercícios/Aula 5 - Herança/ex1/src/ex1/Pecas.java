/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
public class Pecas {
    protected String nome;
    protected double custo;
    protected double lucro;
    
    public Pecas(){
        this.nome = "Não informado";
        this.custo = 0;
        this.lucro = 0;
    }
   public Pecas(String nome, double custo,double preco){
        this.nome = nome;
        this.custo = custo;
        this.lucro = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double Preco(){
        double p;
        
        p = custo + lucro;
        return p;
    }
    
    public void Exibir(){
        System.out.println("Nome:"+nome);
        System.out.println("Custo:"+custo);
        System.out.println("lucro:"+lucro);
        System.out.println("Preço:"+Preco());
    }
}