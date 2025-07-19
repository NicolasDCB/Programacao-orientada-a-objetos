/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
public class Pessoa {
    protected Contato contatos[];
    protected String nome;
    protected int max;
    protected int cont;
    
    public Pessoa(String nome, int max){
        this.nome = nome;
        this.contatos = new Contato[max];
        this.max = max;
        this.cont = 0;
    }
    
    public void adicionarContato(Contato c){
        if(cont < max){
        contatos[cont] = c;
        cont++;            
        }
        
        else{
            System.out.println("Numero máximos de contatos já inseridos");
        }

    }
    
    public Contato[] getContatos(){
    Contato[] resultado = new Contato[cont];
         for (int i = 0; i < cont; i++) {
        resultado[i] = contatos[i];
    }
    return resultado;
    }
    
     public Contato[] getContatos(String tipo){
         Contato ctemp[] = new Contato[cont];
         int conta=0;
         for(int i=0;i<cont;i++){
             if(contatos[i].tipoContato.equals(tipo)){
                 ctemp[conta] = contatos[i];
                 conta++;
             }
         }
        Contato c[] = new Contato[conta];
                for(int i=0;i<conta;i++){
                 c[i] = ctemp[i];
         }
        return c;
    }   
    public boolean possuiEmail(){
        for(int i=0;i<cont;i++){
            if(contatos[i] instanceof Email){
                return true;
            }
        }    
        return false;
    }
    
        public boolean possuiTelefone(){
        for(int i=0;i<cont;i++){
            if(contatos[i] instanceof Telefone){
                return true;
            }
        }    
        return false;
    }
        
     public void Exibir(){
         System.out.println("Nome:"+nome);
         for(int i =0;i<cont;i++){
             contatos[i].Exibir();
      }
    }
     
}
