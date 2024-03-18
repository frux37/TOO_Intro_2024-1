package testeCondicional;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanessalagomachado
 */
public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        int v1 = sc.nextInt();
        System.out.println("Informe o segundo valor");
        int v2 = sc.nextInt();
        
        if (v1 > v2){
            System.out.println(v1+" é o maior valor");
        } else if (v2 > v1){
            System.out.println(v2+" é o maior valor");
        } else {
            System.out.println("Ambos os valores são iguais");
        }
        
    }
}
