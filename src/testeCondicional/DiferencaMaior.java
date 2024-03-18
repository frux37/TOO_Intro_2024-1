/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeCondicional;

import java.util.Scanner;

/**
 *
 * @author vanessalagomachado
 */
public class DiferencaMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor");
        int valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor");
        int valor2 = sc.nextInt();
        
        
        int diferenca = Math.abs(valor2-valor1);
        System.out.println("A diferença entre "+valor1+" e "+valor2+" é "+diferenca);
    }
}
