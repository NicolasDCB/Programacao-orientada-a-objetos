/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author nicol
 */
public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

public Relogio(int hora,int minuto,int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
} 

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

public void Exibir(){
    System.out.println(hora+":"+minuto+":"+segundo);
}

public int Total(){
    int total;
    
    total = hora*3600 + minuto*60 + segundo;
    
    return total;
}
    
}
