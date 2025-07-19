    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package ex1;

    /**
     *
     * @author nicol
     */
    public class Email extends Contato {
        private String email;

        public Email() {
            super("Email");       
            this.email = "Não informado";

        }

        @Override
        public String Get() {
            return email;
        }

        public Email(String email){
            super("Email");
            this.email = email;
        }

        @Override
        public void Exibir(){
            System.out.println("Email:"+email);
        }
    }
