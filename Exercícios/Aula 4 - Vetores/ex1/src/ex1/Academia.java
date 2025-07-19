/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
public class Academia {
    private String nome;
    private String identificador;
    private int idade;
    private float peso;
    private float altura;
    
    public Academia(){
        this.nome = "Não informado";
        this.identificador ="0";
        this.idade = 0;
        this.peso = 0;
        this.altura = 0;
    }
    
        public Academia(String nome,String identificador,int idade,int peso,int altura){
        this.nome = nome;
        this.identificador = identificador;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
        
        
    
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
    
    public void Exibir(){

                System.out.println("Nome:"+nome);
                System.out.println("Idade:"+idade);
                System.out.println("Peso:"+peso);
                System.out.println("Altura:"+altura);
                System.out.println("Identificador:"+identificador);  
        
    }
    
}
