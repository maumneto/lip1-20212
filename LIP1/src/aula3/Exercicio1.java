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
public class Exercicio1 {
  public static double imc(double altura, double peso) {
    double imc;
    imc  = peso/(altura*altura);
    return imc;
  }
  public static double pesoIdeal(double altura, String gen) {
    double peso = -1;
    switch(gen) {
      case "h":
        peso = (72.7 * altura) - 58;
        break;
      case "m":
        peso = (62.1 * altura) - 44.7;
        break;
      default:
        System.out.println("Nenhum genero valido foi escolhido!");
        break;
    }
    return peso;
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String gen;
    double altura, peso, pesoId, imc;
    System.out.println("Diga seu genero: (h/m)");
    gen = in.nextLine();
    System.out.println("Peso: (Kg)");
    peso = in.nextDouble();
    System.out.println("Altura: (m)");
    altura = in.nextDouble();
    imc = imc(altura, peso);
    pesoId = pesoIdeal(altura, gen);
    if (pesoId != -1) {
      System.out.println("Seu peso ideal é: " + pesoId);
    }
    System.out.println("IMC = " + imc);
  }
}
