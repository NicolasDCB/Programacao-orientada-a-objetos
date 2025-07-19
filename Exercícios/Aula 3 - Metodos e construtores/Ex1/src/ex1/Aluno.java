/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
    
    public class Aluno {
  private String ra;
  private String nome;
  private float t1;
  private float t2;
  private float p1;
  private float p2;
  
  public float media(){
      float media = (t1 + t2 + p1 + p2)/4.0f;
      return media;
  }
  
  public boolean aprovado(){
      if(media()>=5){
          return true;
      }
      
      else{
          return false;
      }
  }
  
  public String getRa(){
      return ra;
  }
  
  public void setP1(float nota1){
      if(nota1>=0 && nota1<=10){
                this.p1 = nota1;
      }
  }
  
    public void setP2(float nota2){
      if(nota2>=0 && nota2<=10){
                this.p2 = nota2;
      }
  }
    
      public void setT1(float trab1){
      if(trab1>=0 && trab1<=10){
                this.t1 = trab1;
      }
  }
      
        public void setT2(float trab2){
      if(trab2>=0 && trab2<=10){
                this.t2 = trab2;
      }
  }
        

}
    
