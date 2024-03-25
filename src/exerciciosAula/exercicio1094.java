/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosAula;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio1094 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdeEntrada = entrada.nextInt();
        int totalCobaia = 0;
        int contRatos = 0;
        int contSapos = 0;
        int contCoelho = 0;
        char tipoCobaia;

        for (int i = 0; i <= qtdeEntrada; i++) {
            int n = entrada.nextInt();
            tipoCobaia = entrada.next().charAt(0);
            switch (tipoCobaia) {
                case 'R':
                    contRatos = contRatos + n;
                    break;
                case 'S':
                    contSapos = contSapos + n;
                    break;
                case 'C':
                    contCoelho = contCoelho + n;
                    break;
            }
            totalCobaia = totalCobaia + n;
        }
        
        System.out.println("Total: "+totalCobaia+" cobaias\n" +
"Total de coelhos: "+contCoelho+"\n" +
"Total de ratos: "+contRatos+"\n" +
"Total de sapos: "+contSapos);
        float percCoelhos = (float) contCoelho / totalCobaia;
        DecimalFormat formatoNum = new DecimalFormat("0.00");
        System.out.println("Percentual de coelhos: "+formatoNum.format(percCoelhos * 100)+" %");
        System.out.println("Percentual de ratos: "+formatoNum.format((float) contRatos / totalCobaia *100)+" %");
        System.out.printf("Percentual de sapos: %.2f %%\n", ((float) contSapos / totalCobaia * 100));
    }

}
