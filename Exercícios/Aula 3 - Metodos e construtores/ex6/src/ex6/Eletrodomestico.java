package ex6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicol
 */
public class Eletrodomestico {
    private String nome;
    private float potencia;
    private float tempo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }
    
    public Eletrodomestico(){
        this.nome = "Não informado";
        this.potencia = 0;
        this.tempo = 0;
    }
    
    public Eletrodomestico(String nome, float potencia, float tempo){
        this.nome = nome;
        this.potencia = potencia;
        this.tempo = tempo;
    }
    
    public float WattsDia(){
        return potencia * tempo;
    }
    
    public float WattsMes(){
        return WattsDia() * 30;
    }
    
    public float WattsAno(){
        return WattsMes() * 12;
    }
    
    public float GastoMes(float valor){
        float gasto = WattsMes()/1000;
        
        gasto = gasto * valor;
        
        return gasto;
    }
    
    public void Relatorio(float valor){
        System.out.println("Eletrodoméstico:"+nome);
        System.out.println("Potência:"+potencia);
        System.out.println("Tempo de utilização do aparelho:"+tempo+"horas/dia");
        System.out.println("Watts/Dia:"+WattsDia());
        System.out.println("Watts/Mês:"+WattsMes());
        System.out.println("Watts/Ano:"+WattsAno());
        System.out.println("Preço do watts:R$"+valor);
        System.out.println("Gasto mensal é de:"+GastoMes(valor));
    }
    
}
  