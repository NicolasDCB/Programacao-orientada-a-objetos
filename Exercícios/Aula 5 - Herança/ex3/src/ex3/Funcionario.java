/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author nicol
 */
public class Funcionario {
    protected String nome;
    protected String codigo;
    protected float salario;

    public Funcionario() {
        this.nome = "Não informado";
        this.codigo = "Não informado";
        this.salario = 0;
    }
    
    public Funcionario(String nome, String codigo, float salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void Exibir(){
        System.out.println("Dados do funcionário:");
        System.out.println("Nome:"+nome);
        System.out.println("Código:"+codigo);
        System.out.println("Salário:"+salario);
    }
    
}
