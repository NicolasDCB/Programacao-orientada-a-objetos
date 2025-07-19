/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author nicol
 */
public class Doscentes extends Funcionario{
    protected String titulacao;

    public Doscentes(String titulacao) {
        super();
        this.titulacao = titulacao;
    }

    public Doscentes(String titulacao, String nome, String codigo, float salario) {
        super(nome, codigo, salario);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    @Override
      public void Exibir(){
        super.Exibir();
        System.out.println("Titulação:"+titulacao);
    }  
}
