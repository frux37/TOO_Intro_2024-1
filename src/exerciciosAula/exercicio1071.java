/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosAula;
import java.io.IOException;
import java.util.Scanner;


public class exercicio1071 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um valor para X: ");
        int X = entrada.nextInt();
        
        System.out.println("Informe um valor para Y: ");
        int Y = entrada.nextInt();
        
        int total = 0;
        //int aux;
        int maior = Math.max(X, Y);
        int menor = Math.min(X, Y);
        
        for(int i = menor + 1; i < maior; i++) {
            if(i % 2 != 0) {
                total = total + 1;
            }
        }
        
        /*if(X > Y) {
            aux = X;
            X = Y;
            Y = aux;
        }*/
        
        /*for (int i = X + 1; i < Y; i++) {
            if(i % 2 != 0) {
                total = total + i;
            }
        }*/
        
        System.out.println("O total eh: " + total);
        
        entrada.close();
        
    }
    
}
