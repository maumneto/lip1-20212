/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaNP2;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class questao7 {
    public static void main(String[] args) {
        int fat = 1;
        int entry;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor inteiro positivo: ");
        entry = in.nextInt();
        in.close();
        if (entry < 0) {
            System.out.println("Não é possível calcular.");
        } else {
            for (int i = 1; i <= entry; i++) {
                fat = fat * i;
                System.out.println(fat);
            }
            System.out.println("O fatorial de " + entry + " é " + fat);
        }
    }
}
