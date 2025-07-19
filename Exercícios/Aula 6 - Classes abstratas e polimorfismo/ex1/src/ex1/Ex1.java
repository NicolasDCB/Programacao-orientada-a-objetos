/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

/**
 *
 * @author nicol
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando agenda
        Agenda agenda = new Agenda("Nicolas", 10);

        // Criando pessoas
        Pessoa p1 = new Pessoa("Alice", 5);
        Pessoa p2 = new Pessoa("Bob", 5);
        Pessoa p3 = new Pessoa("Carol", 5);

        // Adicionando contatos
        p1.adicionarContato(new Email("alice@gmail.com"));
        p1.adicionarContato(new Telefone("1234-5678"));

        p2.adicionarContato(new Email("bob@gmail.com"));
        p2.adicionarContato(new Telefone("2222-2222"));

        p3.adicionarContato(new Telefone("9999-9999")); // Sem email

        // Adicionando pessoas na agenda
        agenda.addPessoa(p1);
        agenda.addPessoa(p2);
        agenda.addPessoa(p3);

        System.out.println("=== TODAS AS PESSOAS ===");
        agenda.exibirTodasPessoas();

        System.out.println("\n=== PESSOAS COM EMAIL ===");
        agenda.exibirPessoasComEmail();

        System.out.println("\n=== CONTATO DE BOB ===");
        agenda.exibirContatoPessoa("Bob");

        System.out.println("\n=== BUSCA POR EMAIL 'alice@gmail.com' ===");
        agenda.recuperarPessoaPorEmail("alice@gmail.com");

        System.out.println("\n=== BUSCA POR TELEFONE '2222-2222' ===");
        agenda.recuperarPessoaPorTelefone("2222-2222");

        System.out.println("\n=== BUSCA POR EMAIL INEXISTENTE ===");
        agenda.recuperarPessoaPorEmail("naoexiste@email.com");
    }
    
}
