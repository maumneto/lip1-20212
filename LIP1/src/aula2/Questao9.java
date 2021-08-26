/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int soma = 0;
        for(int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++) {
                System.out.print("Digite o valor do elemento i=" + i + ", j=" + j + ": ");
                matriz[i][j] = in.nextInt();
                if (i == j) {
                    soma = soma + matriz[i][j];
                }
            }
        }
        System.out.println("O valor da soma dos elementos da diagonal principal é: " + soma);
        in.close();
    }
}
