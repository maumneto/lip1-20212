/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;
//import java.lang.*;

public class Questao1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double graus, radianos;
        final double pi = 3.1415;
        System.out.print("Digite o valor em Graus: ");
        graus = in.nextDouble();
        radianos = graus*(pi/180);
        System.out.printf("\nO valor em radianos é: %.2f", radianos);
    }
}
