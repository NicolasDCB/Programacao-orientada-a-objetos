/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author nicol
 */
public class Academia {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
     
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float IMC(){
        float imc = peso / (altura*altura);
        return imc;
    }
    
    public boolean Maior(){
        if(idade>=18){
            return true;
        }
        
        else{
            return false;
        }
    }
    
}
