/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */


public class Exemplo2 {
    public static String upperLetter(String letter) throws InputMismatchException {
        String newLetter;
        newLetter = letter.toUpperCase();
//        System.err.println(letter);
//        System.out.println(newLetter);
        return newLetter;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String letter, newLetter = null;
        System.out.print("Digite uma palavra: ");
        letter = in.next();
        try {
            newLetter = upperLetter(letter);
            System.out.println(newLetter);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            in.close();
        }        
    }
}
