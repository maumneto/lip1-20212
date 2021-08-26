/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, fat = 1;
        System.out.print("Digite um valor: ");
        num = in.nextInt();
        in.close();
        if (num < 0) {
            System.out.println("Não é possível calcular");
        } else {
            for(int i = 1; i <= num; i++) {
            fat = fat * i;
            System.out.println(fat);
        }
        System.out.println("fatorial = " + fat);
        }
    }
}
