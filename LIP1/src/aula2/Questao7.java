/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        int n;
        double sh = 0;
        System.out.print("Digite a quantidade de termos da série harmônica: ");
        n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            sh = sh + (double) 1/i;
            System.out.println(sh);
        }
        System.out.println("Valor total da série harmônica: " + sh);
        in.close();
    }
}
