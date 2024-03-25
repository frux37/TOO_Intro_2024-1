/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vetores;
import javax.swing.JOptionPane;

public class NotasComMedia1 {

    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog("Informe quantas notas deseja armazenar: ");
        int quant = Integer.parseInt(entrada);
        int vet[] = new int[quant];
        int total = 0;
        float media;
        
        for (int i = 0; i < vet.length; i++) {
            String notaStr = JOptionPane.showInputDialog("Informe a " + (i + 1) + "ª nota: ");
            int nota = Integer.parseInt(notaStr);
            vet[i] = nota;
            total = total + nota;
        }
        
        media = (float)total/quant;
        
        JOptionPane.showMessageDialog(null, String.format("A media das notas eh: %.2f", media));
        
        System.out.println("Olá, Mundo!");
    }
}
