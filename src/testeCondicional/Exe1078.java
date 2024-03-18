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
public class Exe1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor");
        int valor = sc.nextInt();
        
        for(int i =1; i<=10;i++){
            System.out.println(i+" x "+valor+" = "+(i*valor));
        }
    }
}
