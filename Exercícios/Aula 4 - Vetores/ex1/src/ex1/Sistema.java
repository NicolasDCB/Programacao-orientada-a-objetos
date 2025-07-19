/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Sistema {
    Scanner entrada = new Scanner(System.in);
    
    public int Menu(){
        String menu = "1 – Cadastrar Aluno\n 2 – Listar Alunos (somente nome)\n 3 – Relatório Geral (exibe todas as informações)\n 9 – Sair";
        System.out.println(menu);
        int op = Integer.parseInt(entrada.nextLine());
        return op;
    }
    
    public void Executar(){
        System.out.println("Sistema da academia");
        int cont =0;
        Academia aluno[] = new Academia[100];
        int op;
        
        do{
            op = Menu();
            switch(op){
                case 1:
                    System.out.println("Nome:");
                    String nome = entrada.nextLine();        
                    System.out.println("Identificador:");
                    String identificador = entrada.nextLine();
                    System.out.println("Idade:");
                    int idade = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Peso:");
                    int peso = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Altura(cm):");
                    int altura = entrada.nextInt();
                    entrada.nextLine();
                    
                    aluno[cont] = new Academia(nome,identificador,idade,peso,altura);
                    cont++;
                    break;
                case 2:
                  System.out.println("Alunos casdastrados no sistema:\n");
                    for(int i=0;i<cont;i++){
                        if(aluno[i]!=null){
                            System.out.println(aluno[i].getNome());
                        }
                    }
                    break;
                case  3:
                    for(int i=0;i<cont;i++){
                        if(aluno[i]!=null){
                            aluno[i].Exibir();
                        }
                    }
                    break;
            }
        }while(op!=9);
    }
}
