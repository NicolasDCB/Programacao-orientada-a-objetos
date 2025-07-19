/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author nicol
 */
public class Tecnico extends Funcionario {
    protected String nivel;

    public Tecnico(String nivel) {
        super();
        this.nivel = nivel;
    }

    public Tecnico(String nivel, String nome, String codigo, float salario) {
        super(nome, codigo, salario);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }
    
    @Override
      public void Exibir(){
        super.Exibir();
        System.out.println("Nível:"+nivel);
    }  
    
}
