/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosAula;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 20212pf.cc0012
 */
public class exercicio1067 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int X = entrada.nextInt();
        
        for(int i = 1; i <= X; i++) {
            if(i % 2 != 0) {
                System.out.printf("%d\n", i);
            }
        }
        
        entrada.close();
    }
    
}
