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
public class Questao6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, media;
        System.out.print("Nota 1: ");
        n1 = in.nextDouble();
        System.out.print("Nota 2: ");
        n2 = in.nextDouble();
        media = (n1 + n2)/2;
        in.close();
        // verificando a situação dos alunos
        if (media >= 7) {
            System.out.println("Aprovado! Tchau!");
        } else if (media < 4) {
            System.out.println("Reprovado! Fica!");
        } else {
            System.out.println("Final! Bora estudar um pouco mais...");
        }
    }
}
