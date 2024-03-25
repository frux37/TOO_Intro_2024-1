/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosAula;

import java.io.IOException;
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
        
        System.out.println("Total " +totalCobaia); //+ " cobaias\n" + "Total Ratos: "+contRatos+ "\nTotal Sapos: "+contSapos+ "Total de Coelhos: " +contCoelho);
    }

}
