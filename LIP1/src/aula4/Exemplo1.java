/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */

public class Exemplo1 {
    public int div(int a, int b) throws ArithmeticException {
        return a/b;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, res = 0;
        System.out.println("A: ");
        a = in.nextDouble();
        System.out.println("B: ");
        b = in.nextDouble();
        try {
            res = 1 / 0;
            System.out.println("resultado: " + res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Não é possível divisão por zero!");
        } finally {
            in.close();
        }
        
        System.out.println(res);
        System.out.println("fim do algoritmo");
    }
}
