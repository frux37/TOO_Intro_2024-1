/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vetores;

import java.util.Scanner;
//Pedir para o usuário inserir valores para adiconar ao vetor, percorrer o vetor e realizar uma média dos valores armazenados no vetor;

public class NotasComMedia {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
       
        int vet[] = new int[10];
        int total = 0;
        float media;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = entrada.nextInt();
            total = total + vet[i];
        }
        
        media = (float) total / vet.length;
        
        System.out.printf("A media eh: %.2f\n", media);
    }
}
