/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author newaccount
 */
public class Exercicio3 {
    public static double sum(double a, double b) {
        return a + b;
    }
    public static double sub(double a, double b) {
        return a - b;
    }
    public static double mult(double a, double b) {
        return a * b;
    }
    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: não pode divisão por zero!");
            return -1;
        } else {
            return (double)a/b;
        }
    }
    public static void error(double e) {
        if (e == -1){System.out.println("Error");}
    }
    public static void help() {
        System.out.println("Bem vindo a Calculadora Simples!");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double v1, v2, res = 0;
        int op;
        if (args[0].equals("-h") || args[0].equals("help")){
            help();
            System.exit(0);
        }
        System.out.print("Digite o valor 1: ");
        v1 = in.nextDouble();
        System.out.print("Digite o valor 2: ");
        v2 = in.nextDouble();
        System.out.print("Qual a operação: ");
        op = in.nextInt();
        switch(op) {
            case 1:
                res = sum(v1, v2);
                break;
            case 2:
                res = sub(v1, v2);
                break;
            case 3:
                res = mult(v1, v2);
                break;
            case 4:
                res = div(v1, v2);
                error(res);
                break;
            default:
                System.out.println("Nenhum opção válida foi inserida!");
                break;
        }
        System.out.println("Resultado: " + res);
    }
}
