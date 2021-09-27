/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaNP1;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Questao7 {
    public static void matriz(int dim1, int dim2) {
        Scanner in = new Scanner(System.in);
        int[][] m = new int[dim2][dim2];
        int soma = 0;
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                System.out.print("Digite o elemento i="+i+" j= "+j+" : ");
                m[i][j] = in.nextInt();
                soma = soma + m[i][j];
            } 
        }
        System.out.println("A soma dos valores é: " + soma);
        in.close();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dim1, dim2;
        System.out.print("Dimensão 1: ");
        dim1 = in.nextInt();
        System.out.print("Dimensão 2: ");
        dim2 = in.nextInt();
        // chamando a sub-rotina
        matriz(dim1, dim2);
        in.close();
    }
}
