/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Sistema {
    Scanner entrada = new Scanner(System.in);
    public int Menu(){
        String menu = "1 – Cadastrar Departamento\n" +
                      "2 – Cadastrar Funcionário Técnico\n" +
                      "3 – Cadastrar Funcionário Docente\n" +
                      "4 – Buscar Departamento por Nome\n" +
                      "5 – Buscar Funcionário por Nome\n" +
                      "6 – Listar Departamentos com Funcionários com Faixa Salarial Específica\n" +
                      "7 – Listar Funcionários com Faixa Salarial Específica\n" +
                      "8 – Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica\n" +
                      "9 – Listar todos Funcionários da Universidade\n" +
                      "10 – Listar todos Departamentos da Universidade\n" +
                      "11 – Listar todos Departamentos da Universidade e seus Respectivos Funcionários\n" +
                      "12 – Listar todos Funcionários Docente\n" +
                      "13 – Listar todos Funcionários Técnico\n" +
                      "0 – Sair";
        System.out.println(menu);
        int op = entrada.nextInt();
        entrada.nextLine();
        return op;
    }
    
    public void Executar(){
        int op;
        Universidade uni = new Universidade("UNESP"); 
        do{
            op = Menu();
            
            switch(op){           
                case 1:
                System.out.println("Informe o nome do departamento:");
                String nomeDepto = entrada.nextLine();

                System.out.println("Informe o código do departamento:");
                String codDepto = entrada.nextLine();

                Departamento d = new Departamento(nomeDepto, codDepto);
                uni.AdicionarDepartamento(d);
                System.out.println("Departamento adicionado com sucesso.");
                break;

            case 2:
                System.out.println("Informe o código do departamento:");
                String codDep = entrada.nextLine();
                Departamento deptoTec = uni.buscarDepartamentoPorCodigo(codDep);

                if (deptoTec != null) {
                    System.out.println("Informe o nome do funcionário:");
                    String nomeTec = entrada.nextLine();
                    System.out.println("Informe o código do funcionário:");
                    String codTec = entrada.nextLine();
                    System.out.println("Informe o salário:");
                    float salarioTec = entrada.nextFloat(); entrada.nextLine();
                    System.out.println("Informe o nível:");
                    String nivel = entrada.nextLine();

                    Tecnico t = new Tecnico(nivel, nomeTec, codTec, salarioTec);
                    deptoTec.adicionarFuncionario(t);
                    System.out.println("Funcionário Técnico adicionado.");
                } else {
                    System.out.println("Departamento não encontrado.");
                }
                break;

            case 3:
                System.out.println("Informe o código do departamento:");
                String codDep2 = entrada.nextLine();
                Departamento deptoDoc = uni.buscarDepartamentoPorCodigo(codDep2);

                if (deptoDoc != null) {
                    System.out.println("Informe o nome do funcionário:");
                    String nomeDoc = entrada.nextLine();
                    System.out.println("Informe o código do funcionário:");
                    String codDoc = entrada.nextLine();
                    System.out.println("Informe o salário:");
                    float salarioDoc = entrada.nextFloat(); 
                    entrada.nextLine();
                    System.out.println("Informe a titulação:");
                    String titulacao = entrada.nextLine();

                    Doscentes d2 = new Doscentes(titulacao, nomeDoc, codDoc, salarioDoc);
                    deptoDoc.adicionarFuncionario(d2);
                    System.out.println("Funcionário Docente adicionado.");
                } else {
                    System.out.println("Departamento não encontrado.");
                }
                break;
                
            case 4:
                System.out.println("Informe o nome do departamento");
                String nomeDep = entrada.nextLine();
                
                for(int i=0;i<uni.getContDepartamentos();i++){
                   Departamento dep = uni.getDepartamentos()[i];
                   if(dep.getNome().equals(nomeDep)){
                       dep.Exibir();
                   }
                }
                break;
                
            case 5:
                System.out.println("Informe o nome do funcioário:");
                String nomefun = entrada.nextLine();
                
                for(int i=0;i<uni.contdepartamento;i++){
                    Departamento dep = uni.getDepartamentos()[i];
                    for(int j=0;j<dep.getContFuncionario();j++){
                        Funcionario fun = dep.getFuncionario()[j];
                        if(fun.getNome().equals(nomefun)){
                            dep.Exibir();
                        }
                    }
                }
                break;
            case 6:
                System.out.println("Informe a faixa inicial de salário:");
                float salarioini = entrada.nextFloat();
                
                 System.out.println("Informe a faixa final de salário:");
                float salariofim = entrada.nextFloat();
                
                 for(int i=0;i<uni.getContDepartamentos();i++){
                     Departamento dep = uni.getDepartamentos()[i];
                      for(int j=0;j<dep.contFuncionario;j++){
                          Funcionario fun = dep.getFuncionario()[j];
                          if(fun.getSalario()>=salarioini && fun.getSalario()<=salariofim){
                              dep.Exibir();
                          }
                      }
                 }
                break;
                
            case 7:
                 System.out.println("Informe a faixa inicial de salário:");
                float salarioinic = entrada.nextFloat();
                 entrada.nextLine();

                 System.out.println("Informe a faixa final de salário:");
                float salariofinal = entrada.nextFloat();
                entrada.nextLine();
 
                 for(int i=0;i<uni.getContDepartamentos();i++){
                     Departamento dep = uni.getDepartamentos()[i];
                      for(int j=0;j<dep.contFuncionario;j++){
                          Funcionario fun = dep.getFuncionario()[j];
                          if(fun.getSalario()>=salarioinic && fun.getSalario()<=salariofinal){
                              fun.Exibir();
                          }
                      }
                 }               
                break;
            case 8:
                System.out.println("Informe a faixa inicial de gasto");
                float gastoini = entrada.nextFloat();
                entrada.nextLine();
                
                System.out.println("Informe a faixa final de gasto");
                float gastofim = entrada.nextFloat();
                entrada.nextLine();
                
                float gasto = 0;
                
                for(int i=0;i<uni.getContDepartamentos();i++){
                    Departamento dep = uni.getDepartamentos()[i];
                     for(int j=0;j<dep.contFuncionario;j++){
                         Funcionario fun = dep.getFuncionario()[j];
                         gasto = gasto + fun.getSalario();
                     }
                     
                     if(gasto>=gastoini && gasto<=gastofim){
                         dep.Exibir();
                     }
                     gasto =0;
                }
                break;
            case 9:
                for(int i=0;i<uni.contdepartamento;i++){
                    Departamento dep = uni.getDepartamentos()[i];
                    for(int j=0;j<dep.contFuncionario;j++){
                        Funcionario fun = dep.getFuncionario()[j];
                        fun.Exibir();
                    }
                }
                break;
                
            case 10:
                  for(int i=0;i<uni.contdepartamento;i++){
                    Departamento dep = uni.getDepartamentos()[i];
                      dep.Exibir();
                }              
                break;
                
            case 11:
                 for(int i=0;i<uni.contdepartamento;i++){
                    Departamento dep = uni.getDepartamentos()[i];
                     System.out.println("Departamento:");
                     dep.Exibir();
                     System.out.println("Funcionarios:");
                    for(int j=0;j<dep.contFuncionario;j++){
                        Funcionario fun = dep.getFuncionario()[j];
                        fun.Exibir();
                    }
                }               
                break;
            case 12:
                  for(int i=0;i<uni.contdepartamento;i++){
                    Departamento dep = uni.getDepartamentos()[i];
                    for(int j=0;j<dep.contFuncionario;j++){
                        if(dep.getFuncionario()[j] instanceof Doscentes){
                           Funcionario fun = dep.getFuncionarios()[j];
                        fun.Exibir();                            
                        }
                    }
                }              
                break;
            case 13:
                   for(int i=0;i<uni.contdepartamento;i++){
                    Departamento dep = uni.getDepartamentos()[i];
                    for(int j=0;j<dep.contFuncionario;j++){
                        if(dep.getFuncionario()[j] instanceof Tecnico){
                           Funcionario fun = dep.getFuncionarios()[j];
                        fun.Exibir();                            
                        }
                    }
                }                
                break;
            }
            
            
        }while(op!=0);
    }
}
