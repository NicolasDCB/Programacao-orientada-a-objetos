/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author nicol
 */  
public class Departamento {
    protected String nome;
    protected String codigo;
    protected Funcionario[] funcionario;
    protected int contFuncionario;

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

    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }

    public int getContFuncionario() {
        return contFuncionario;
    }

    public void setContFuncionario(int contFuncionario) {
        this.contFuncionario = contFuncionario;
    }
    
    

    public Departamento() {
        this.nome = "Não informado";
        this.codigo = "Não informado";
        this.funcionario = new Funcionario[100];
        this.contFuncionario = 0;
    }

    public Departamento(String nome,String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.funcionario = new Funcionario[100];
        this.contFuncionario = 0;
    } 
    
        public void adicionarFuncionario(Funcionario f) {
        if (contFuncionario < 100) {
            funcionario[contFuncionario] = f;
                contFuncionario++;
        } else {
            System.out.println("Limite de funcionários atingido!");
        }
    }
     public Funcionario[] getFuncionarios() {
        return funcionario;
    }

    public int getContFuncionarios() {
        return contFuncionario;
    }

  public void Exibir(){
      System.out.println("Nome do departamento:"+nome);
      System.out.println("Código do departamento:"+codigo);
      System.out.println("Numero de funcionarios:"+contFuncionario);
  }
    
}
