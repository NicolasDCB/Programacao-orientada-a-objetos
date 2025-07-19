/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Sistema {
    Scanner entrada = new Scanner(System.in);
    
    public int Menu(){
        String menu = "1– Cadastrar Nova Conta\n 2 – Saque\n 3 – Depsotio \n 4 - Listar contas\n 5 - Relatório Geral\n 6 – Relatório de Contas cujo saldo está abaixo de zero\n 7 – Relatório da Conta de um determinado cliente\n 9 – Sair";
        System.out.println(menu);
        int op = Integer.parseInt(entrada.nextLine());
        return op;
    }
    
    public void Executar(){
        System.out.println("Sistema do Banco");
        int cont =0;
        Conta c[] = new Conta[100];
        int op;
        
        do{
            op = Menu();
            switch(op){
                case 1:
                    System.out.println("Titular:");
                    String titular = entrada.nextLine();        
                    System.out.println("Numero:");
                    String numero = entrada.nextLine();
                    System.out.println("Saldo:");
                    double saldo = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.println("Limite:");
                    double limite = entrada.nextDouble();
                    entrada.nextLine();

                    c[cont] = new Conta(titular,numero,saldo,limite);
                    cont++;
                    break;
                case 2:
                    
                    System.out.println("Informe o numero da conta que deseja sacar:\n");
                    String num = entrada.nextLine();        
                     for(int i=0;i<cont;i++){
                         if(c[i].getNumero().equals(num)){
                             System.out.println("Informe o valor de saque:");
                             double val = entrada.nextDouble();
                             entrada.nextLine();
                             c[i].Saque(val);
                             break;
                         }
                     }
                       System.out.println("Numero de conta não existe");
                    break;
                case  3:
                    System.out.println("Informe o numero da conta que deseja depositar:\n");
                    String n = entrada.nextLine();        
                     for(int i=0;i<cont;i++){
                         if(c[i].getNumero().equals(n)){
                             System.out.println("Informe o valor de depósito:");
                             double val = entrada.nextDouble();
                             entrada.nextLine();
                             c[i].depositar(val);
                             break;
                         }
                     }
                       System.out.println("Numero de conta não existe");
                    break;
                    
                case 4:
                     if (cont == 0) {
                         System.out.println("Nenhuma conta cadastrada.");
                         }
                     else{
                    System.out.println("Nomes dos clientes cadastrados:\n");
                    for(int i=0;i<cont;i++){
                        System.out.println("Conta "+i+" Titular:"+c[i].getTitular());
                    }
                   }
                    break;
                case 5:
                    System.out.println("Relatório geral das conta:\n");
                    for(int i=0;i<cont;i++){
                        System.out.println("Conta "+i);
                        c[i].Exibir();
                    }
                    break;
                case 6:
                    System.out.println("Relatório geral das conta com limite <0:\n");
                    for(int i=0;i<cont;i++){
                        if(c[i].getSaldo()<0){
                        System.out.println("Conta "+i);
                        c[i].Exibir();                            
                        }
                    }
                    break;
                case 7:
                    System.out.println("Informe o nome do titular da conta:");
                    String t = entrada.nextLine();
                     for(int i=0;i<cont;i++){
                         if(c[i].getTitular().equals(t)){
                             c[i].Exibir();
                             break;
                         }
                     }
                     System.out.println("Titular de conta não encontrado");
                    break;
            }
        }while(op!=9);
    }
}