/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Faça um programa que entre com o valor de duas notas, calcule a média aritmética e verifique a situação do aluno:
//○ Aprovado (média ≥ 7.0)
//○ Reprovado (média > 4.0)
//○ Final (4.0 ≤ média < 7.0).
//○ Caso o aluno esteja na final, o programa deve receber a nota da
//prova final do aluno e verificar pela nova média se o aluno foi aprovado ou não na disciplina:
//Aprovado na Final (média ≥ 5.0)
//Reprovado na Final (média < 5.0).
package aula2;

import java.util.Scanner;

/**
 *
 * @author newaccount
 */
public class Questao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, media;
        // entrada de dados
        System.out.println("Digite a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = in.nextDouble();
        media = (nota1 + nota2)/2;
        System.out.println("Média = " + media);
        // verificar as codições
        if (media >= 7.0) {
            System.out.println("Aprovado! Vai-te embora!");
        } else if (media < 4.0) {
            System.out.println("Reprovado! Fica por ai mesmo...");
        } else {
            System.out.println("Esta Final, vamos resolver uma prova!");
            double mediaFinal, provaFinal;
            System.out.println("Digite a nota da Final: ");
            provaFinal = in.nextDouble();
            mediaFinal = (provaFinal + media)/2;
            System.out.println("A Media Final do aluno é: " + mediaFinal);
            if (mediaFinal >= 5.0) {
                System.out.println("Aprovado! Ufa, por pouco hein!");
            } else {
                System.out.println("Reprovado! É não deu mesmo...");
            }
        }
        in.close();
    }
}
