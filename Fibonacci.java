package com.feliperebolledo.jdbc;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Fibonacci {

    public static void main(String[] args) {
        int contador;
        long a, b, d;
        a = 0;
        b = 1;
        d = 0;
        contador = 0;
        boolean noHay = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE UN NÚMERO PARA VERIFICAR SU LUGAR EN LA SECUENCIA DE FIBONACCI");
        System.out.println("EL MAXIMO PERMITIDO ES: " + (Integer.MAX_VALUE - 1));
        d = scanner.nextLong();

        if (d < Integer.MAX_VALUE) {
            int fibonacci[] = new int[48];

            while (a <= d) {
                System.out.println(contador + " -- " + a);
                long suma = a + b;
                a = b;
                b = suma;
                fibonacci[contador] = (int) a;
                ++contador;
            }

            for (int i = 0; i < fibonacci.length; i++) {
                if (fibonacci[i] == d) {
                    System.out.println("El lugar en la secuencia es: " + (i+1));
                    noHay = false;
                } else {

                }

            }
            if (noHay) {
                System.out.println("El número " + d + " No existe en la secuencia de Fibonacci");
            }

        } else {
            System.out.println("EL NUMERO ES MUY GRANDE. \n debe ser menor o igual a 2,147,483,648");
        }
    }
}
