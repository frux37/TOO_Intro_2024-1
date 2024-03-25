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
        
        int X = entrada.nextInt();
        int Y = entrada.nextInt();
        int total = 0;
        
        if(X > Y) {
            int temp = X;
            X = Y;
            Y = temp;
        }
        
        for (int i = X + 1; i < Y; i++) {
            if(i % 2 != 0) {
                total = total + i;
            }
        }
        
        System.out.println(total);
        
        entrada.close();
        
    }
    
}
