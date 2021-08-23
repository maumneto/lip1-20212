/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        double valor, salarioBruto, ir, inss, sind, salarioLiq;
        int horas;
        Scanner in = new Scanner(System.in);
        System.out.print("Qual o valor da hora? ");
        valor = in.nextDouble();
        System.out.print("Quantas horas trabalhadas? ");
        horas = in.nextInt();
        salarioBruto = valor * horas;
        ir = 0.11 * salarioBruto;
        inss = 0.08 * salarioBruto;
        sind = 0.05 * salarioBruto;
        salarioLiq = salarioBruto - ir - inss - sind;
        System.out.println("\n Salario Bruto: R$ " + salarioBruto);
        System.out.println("INSS: R$ " + inss);
        System.out.println("IR: R$ " + ir);
        System.out.println("Sindicato: R$ " + sind);
        System.out.println("Salario Liquido: R$ " + salarioLiq);
    }
}

