/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
public class Telefone extends Contato {
     private String telefone;
    
    public Telefone(){
        super("Telefone");
        this.telefone = "Não informado";
    }
    
     @Override
    public String Get(){
        return telefone;
    }
    
    public Telefone(String telefone){
        super("Telefone");
        this.telefone = telefone;
    }
    
     @Override
    public void Exibir(){
        System.out.println("Telefone"+telefone);
    }
}
