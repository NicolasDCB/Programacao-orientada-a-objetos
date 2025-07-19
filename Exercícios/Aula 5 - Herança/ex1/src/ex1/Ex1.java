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
        Pecas p1 = new Pecas("HD SSD", 200, 50);
        PecaImportada p2 = new PecaImportada("Placa de vídeo", 1000, 300, 200, 150);

        System.out.println("Peça comum:");
        p1.Exibir();
        
        System.out.println("\nPeça importada:");
        p2.Exibir();
    }
    
}
