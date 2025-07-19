/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Infome a hora:");
        int h = entrada.nextInt();
        
        System.out.println("Infome o minuto:");
        int m = entrada.nextInt();
                
        System.out.println("Infome o segundo:");
        int s = entrada.nextInt();
        
        Relogio r1 = new Relogio(h,m,s);
        
        r1.Exibir();
        System.out.println("Numero de total de segundos:"+r1.Total()+"s");
    }
    
}
