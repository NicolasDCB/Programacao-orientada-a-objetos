/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        
        a1.setP1(8);
        a1.setP2(8);
        a1.setT1(8);
        a1.setT2(9);
        System.out.println("Media:"+a1.media());
        
    }
    
}
