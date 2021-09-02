/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;
        
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author newaccount
 */
public class Exercicio3parte2 {

    /**
     *
     * @param arguments
     * @return num
     */
    public static int sum (List<Integer> arguments) {
        int num = 0;
        for(int number : arguments) {
            num += number; //num = num + number;
        }
        return num;
    }

    /**
     *
     * @param arguments
     * @return num
     */
    public static int sub (List<Integer> arguments) {
        int num = 0;
        for(int number : arguments) {
            num = num - number; //num = num - number;
        }
        return num;
    }

    /**
     *
     * @param arguments
     * @return num
     */
    public static int mult (List<Integer> arguments) {
        int num = 1;
        for(int number : arguments) {
            num *= number; //num = num * number;
        }
        return num;
    }

    /**
     *
     * @param arguments
     * @return num
     */
    public static double div (List<Integer> arguments) {
        double num = 1;
        for(int number : arguments) {
            if (number == 0) {
                System.out.println("Não é possível divisão por zero!");
                num = -1;
            } else {
                num = (double) num/number;
                System.out.println(num);
            }
        }
        return num;
    }

    /**
     *
     * @param e
     */
    public static void error(double e) {
        if (e == -1){System.out.println("Error");}
    }

    /**
     * help method
     */
    public static void help() {
        System.out.println("Bem vindo a Calculadora Simples!");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        int res = 0, op;
        if (args[0].equals("-h") || args[0].equals("help")){
            help();
            System.exit(0);
        }
        List<Integer> arguments = new ArrayList<>();
        for (String arg : args) {
            arguments.add(Integer.parseInt(arg));
        }
        System.out.print("Qual a operação: ");
        op = in.nextInt();
        in.close();
        switch(op) {
            case 1 : {
                res = sum(arguments);
                System.out.println("Resultado: " + res);
                break;
            }
            case 2 : {
                res = sub(arguments);
                System.out.println("Resultado: " + res);
                break;
            }
            case 3 : {
                res = mult(arguments);
                System.out.println("Resultado: " + res);
                break;
            }
            case 4 : {
                double result;
                result = div(arguments);
                error(result);
                System.out.println("Resultado: " + result);
                break;
            }
            default : {
                System.out.println("Nenhum opção válida foi inserida!");
                break;
            }
        }
    }
}
