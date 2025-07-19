/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("*********Cadastro de cliente**********");
        
        System.out.println("Titular da conta:");
        String t = entrada.nextLine();
        
        System.out.println("Saldo da conta:");
        double s = entrada.nextDouble();
        
        System.out.println("Limite da conta:");
        double l = entrada.nextDouble();
        
        Conta c1 = new Conta(t,s,l);
;
        c1.Exibir();
        
        c1.Depositar(200);
        c1.Exibir();
        c1.Saque(500);
        c1.Exibir();

    }
    
}
