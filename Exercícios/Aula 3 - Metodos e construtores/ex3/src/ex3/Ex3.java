/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

/**
 *
 * @author nicol
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        
        c1.setNome("Nicolas");
        c1.setConta("111");
        c1.setSaldo(100);
        
        c1.depositar(50);
        c1.Sacar(100);
        
        System.out.println(c1.getSaldo());
    }
    
}
