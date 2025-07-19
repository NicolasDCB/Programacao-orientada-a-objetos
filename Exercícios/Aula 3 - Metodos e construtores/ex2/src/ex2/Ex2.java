/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author nicol
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Academia a1 = new Academia();
        
        a1.setNome("Nicolas");
        a1.setAltura((float) 1.80);
        a1.setIdade(17);
        a1.setPeso(83);
        
        System.out.println(a1.IMC());
        System.out.println(a1.Maior());
    }
    
}
