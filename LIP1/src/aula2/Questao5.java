/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

//Faça um programa que calcule as raízes da equação de 2o grau. Lembre-se que: x = (−b ± √∆)/2a onde ∆ = b2 – 4ac

import java.util.Scanner;

//E ax2 + bx + c = 0 representa uma equação do 2o grau. A variável ’a’ tem que ser diferente de zero. Caso seja igual, imprima a mensagem “Não é equação do segundo grau”. Se ∆ < 0, não existe real. Imprima a mensagem “Não existe raiz”. Se ∆ = 0, existe uma raiz real. Imprima a raiz e a mensagem Raiz Única. Se ∆ >= 0, imprima as duas raízes.
public class Questao5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.print("a = ");
        a = in.nextDouble();
        System.out.print("b = ");
        b = in.nextDouble();
        System.out.print("c = ");
        c = in.nextDouble();
        if (a == 0) {
            System.out.println("Não é equação do segundo!");
            System.exit(0);
        } else {
            delta = b*b - 4*a*c;
            System.out.println("Delta = " + delta);
            if (delta < 0) {
                System.out.println("Não existe raizes reais");
            } else if (delta == 0) {
                System.out.println("Existe uma raiz real");
                x1 = (-b + Math.sqrt(delta))/(2*a);
                System.out.println("A raiz é = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        in.close();
    }
}
