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
        String menu = "1 – Cadastrar Produto Estadual\n2 – Cadastrar Produto Nacional\n 3 – Cadastrar Produto Importado \n 4 – Exibir Produtos Estaduais\n 5 – Exibir Produtos Nacionais\n 6 – Exibir Produtos Importados\n 7 – Exibir Todos Produtos\n 9 – Sair";
        System.out.println(menu);
        int op = Integer.parseInt(entrada.nextLine());
        return op;
    }
    
    public void Executar(){
        System.out.println("Sistema de produtos");
        int cont1 =0;

        Produto p [] = new Produto[100]; 
        int op;
        
        do{
           op = Menu();
           
           switch(op){
            case 1:
                System.out.println("Descrição do produto estadual:");
                String d = entrada.nextLine();
                
                System.out.println("Valor:");
                float v = entrada.nextFloat();
                entrada.nextLine();
                
                p[cont1] = new ProdutoEstadual(d,v);
                cont1++;
             break; 
             
            case 2:
                 System.out.println("Descrição do produto nacional:");
                String des = entrada.nextLine();
                
                System.out.println("Valor:");
                float val = entrada.nextFloat();
                entrada.nextLine();
                
                p[cont1] = new ProdutoNacional(des,val);
                cont1++;
             break; 
             
            case 3:
                 System.out.println("Descrição do produto importado:");
                String desc = entrada.nextLine();
                
                System.out.println("Valor:");
                float valo = entrada.nextFloat();
                entrada.nextLine();
                
                p[cont1] = new ProdutoImportado(desc,valo);  
                cont1++;                
             break; 
             
            case 4:
                System.out.println("Lista de todos os produtos estaduais:");
                for(int i=0;i<cont1;i++){
                        if (p[i] instanceof ProdutoEstadual) {
                            p[i].Relatorio();
                              }
                }
             break; 
             
            case 5:
                System.out.println("Lista de todos os produtos nacionais:");
                for(int i=0;i<cont1;i++){
                      if (p[i] instanceof ProdutoNacional) {
                           p[i].Relatorio();
                            }
                }
             break; 
             
            case 6:
                System.out.println("Lista de todos os produtos importados:");
                for(int i=0;i<cont1;i++){
                    if(p[i] instanceof ProdutoImportado){
                     p[i].Relatorio();
                       
                    }
                }                
             break; 
             
            case 7:
                System.out.println("Lista de todos os produtos:");
                for(int i=0;i<cont1;i++){
                    p[cont1].Relatorio();
                }                
             break;           
        }

        }while(op!=9);
    }
}
