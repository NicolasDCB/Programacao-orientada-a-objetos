/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
public abstract class Contato {
    protected String tipoContato;
    
    public Contato(String tipoContato){
        this.tipoContato = tipoContato;
    }
    
    public abstract void Exibir();
    
    public abstract String Get();
}
    