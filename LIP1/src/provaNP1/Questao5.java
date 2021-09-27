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
public class Questao5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, prestacao;
        System.out.println("Valor do salário: ");
        salario = in.nextDouble();
        System.out.println("Valor da prestação do emprestimo: ");
        prestacao = in.nextDouble();
        in.close();
        if (prestacao > 0.2*salario) {
            System.out.println("Emprestimo NAO concedido!");
        } else {
            System.out.println("Emprestimo Concedido!");
        }
    }
}
