/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeCondicional;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author vanessalagomachado
 */
public class PlanoDeSaude {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade "+nome));
        double valorPlano = 0;
        
        if(idade <= 10){
            valorPlano = 30;
        } else if (idade <= 29){
            valorPlano = 60;
        } else if (idade <= 45){
            valorPlano = 120;
        } else if (idade <= 59){
            valorPlano = 150;
        } else if(idade <= 65){
            valorPlano = 250;
        } else{
            valorPlano = 400;
        }
        
        DecimalFormat formatoNumero = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "Olá "+nome+ 
                " você pagará R$ "+formatoNumero.format(valorPlano));
        
        
        
    }
}
