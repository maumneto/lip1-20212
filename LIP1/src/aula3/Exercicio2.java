/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author newaccount
 */
// 0 1 1 2 3 5 8 ...
public class Exercicio2 {
    public static void fibonacci(int n) {
        int a = 0, b = 1, aux = 0;
        if (n == 1){System.out.print("0");}
        else if (n == 2) {System.out.print("0 1");}
        else{
            System.out.print("0 1 ");
            for (int i = 2; i < n; i++) {
                aux = a + b;
                a = b;
                b = aux;
                System.out.print(" " + aux + " ");
            }
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Quantidade de termos de Fibonacci: ");
        n = in.nextInt();
        in.close();
        fibonacci(n);
        System.out.println("Fim do Algoritmo");
    }
}
