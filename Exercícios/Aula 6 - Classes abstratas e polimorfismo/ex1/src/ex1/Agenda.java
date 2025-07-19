/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
public class Agenda {
    protected String proprietario;
    protected Pessoa pessoas[];
    protected int max;
    protected int cont;
    
    public Agenda(String proprietario, int max){
      this.proprietario = proprietario;
      this.max = max;
      pessoas = new Pessoa[max];
   }
    
    public void addPessoa(Pessoa p){
        if(cont<max){
        pessoas[cont] = p;
        cont++; 
        }
        else{
            System.out.println("Numero máximos de pessoas na agenda atingido");
        }
    }
    
    public void addContato(String nome, Contato c){
        for(int i=0;i<cont;i++){
         if(pessoas[i].nome.equals(nome)){
             pessoas[i].adicionarContato(c);
         }   
      }
    }
    
    public void exibirTodasPessoas(){
        for(int i=0;i<cont;i++){
            System.out.println("Nome:"+pessoas[i].nome);
        }
    }
    
    public void exibirContatoPessoa(String nome){
        for(int i=0;i<cont;i++){
         if(pessoas[i].nome.equals(nome)){
             pessoas[i].Exibir();
         }   
      }
    } 
 
    public void exibirPessoasComEmail(){
        for(int i=0;i<cont;i++){
          if(pessoas[i].possuiEmail() == true){
              System.out.println("Nome:"+pessoas[i].nome);
          }  
      }
    }

    public void recuperarPessoaPorEmail(String email){
        for(int i=0;i<cont;i++){
            Contato c[] = pessoas[i].getContatos("Email");
           for (int j = 0; j < c.length; j++) {
                  String em = c[j].Get();
                   if (em.equals(email)) {
                   pessoas[i].Exibir();
                }
                }

        }
    } 
    
     public void recuperarPessoaPorTelefone(String telefone){
        for(int i=0;i<cont;i++){
            Contato c[] = pessoas[i].getContatos("Telefone");
          for (int j = 0; j < c.length; j++) {
                   String em = c[j].Get();
                if (em.equals(telefone)) {
               pessoas[i].Exibir();
                }
}

        }
    }    
}

