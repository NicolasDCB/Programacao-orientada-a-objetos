/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("*********Cadastro de eletrodomestico da casa********");
        
        System.out.println("Nome:");
        String nome = entrada.nextLine();
        
        System.out.println("Pontência:");
        float potencia = entrada.nextFloat();
        
        System.out.println("Tempo de utilização diario em horas:");
        float tempo = entrada.nextFloat();
        
        Eletrodomestico e1 = new Eletrodomestico(nome,potencia,tempo);
       
        e1.Relatorio(0.27f);
    }
    
}
