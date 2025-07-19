/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author nicol
 */
public class Universidade {
      protected String nome;
      protected Departamento[] departamento;
      protected int contdepartamento;

    public Universidade() {
        this.nome = "Não informado";
        this.departamento = new Departamento[100];
    }
    public Universidade(String nome) {
        this.nome = nome;
        this.departamento = new Departamento[100];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void AdicionarDepartamento(Departamento d){
        if(contdepartamento<100){
            departamento[contdepartamento] = d;
            contdepartamento++;
        }
    }
    public Departamento buscarDepartamentoPorCodigo(String codigo) {
        for (int i = 0; i < contdepartamento; i++) {
                if (departamento[i].getCodigo().equals(codigo)) {
                  return departamento[i];
            }
        }
        return null;
    }

    public Departamento[] getDepartamentos() {
        return departamento;
    }

    public int getContDepartamentos() {
        return contdepartamento;
    }
}
      
