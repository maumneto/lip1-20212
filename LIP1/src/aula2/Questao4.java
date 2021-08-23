/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author newaccount
 */
public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float altura, peso = 0;
        String sexo;
        // entradas de dados
        System.out.print("Qual o seu sexo(h/m): ");
        sexo = input.next();
        System.out.print("Qual a sua altura: ");
        altura = input.nextFloat();
        input.close();
        // switch
        switch(sexo) {
            case "h":
                peso = (float) (72.7*altura - 58);
                break;
            case "m":
                peso = (float) (62.1*altura - 44.7);
                break;
            default:
                System.out.println("O valor do sexo está incorreto.");
                break;
        }
        // saida de dados
        System.out.println("Seu peso ideal é: " + peso);
    }
}
