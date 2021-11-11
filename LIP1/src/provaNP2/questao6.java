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
public class questao6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int somaQuad = 0;
        int quadSoma = 0;
        int aux = 0;
        int diff = 0;
        int qtd;
        System.out.println("Valor da quantidade de termos: ");
        qtd = in.nextInt();
        while(aux <= qtd) {
            somaQuad = somaQuad + aux*aux;
            quadSoma += aux;
            aux++;
        }
        quadSoma = quadSoma*quadSoma;
        System.out.println("Quadrado da Soma: " + quadSoma);
        System.out.println("Soma dos Quadrados: " + somaQuad);
        diff = quadSoma - somaQuad;
        System.out.println("Diferença é: " + diff);
    }
}
