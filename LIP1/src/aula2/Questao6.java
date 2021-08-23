/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author newaccount
 */
public class Questao6 {
    public static void main(String[] args) {
        int somaQuad = 0, quadSoma = 0, n = 0, diff = 0;
        while(n <= 10) {
            somaQuad = somaQuad + n*n;
            quadSoma = quadSoma + n;
            quadSoma += n*n;
            n++;
        }
        System.out.println("A soma dos Quadrados é = " + somaQuad);
        quadSoma = quadSoma*quadSoma;
        System.out.println("O Quadrado da Soma é = " + quadSoma);
        diff = quadSoma - somaQuad;
        System.out.println("A diferença é = " + diff);
    }
}
