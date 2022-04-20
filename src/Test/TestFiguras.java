/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import figurasgeometricas.Circulo;
import figurasgeometricas.Cuadrado;
import figurasgeometricas.Triangulo;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TestFiguras {

    public static void main(String[] args) {
        var opcion = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENID@ \n SELECCIONE UNA FIGURA \n 1) CUADRADO \n 2) TRIANGULO \n 3)CIRCULO ");
        opcion = Integer.parseInt(scanner.nextLine());

        if (opcion == 1) {
            var scanner2 = new Scanner(System.in);

            System.out.println("INGRESE CUANTO MIDE UN LADO DEL CUADRADO EN CM");
            Double lado;
            lado = Double.parseDouble(scanner2.nextLine());
            var cuadrado = new Cuadrado(lado);
            System.out.println("La figura es :" + cuadrado.nombreFigura()
                    + "\n su area es: " + cuadrado.calcularArea()
                    + "\n su perímetro es: " + cuadrado.calcularPerimetro()
                    + "\n " + cuadrado.numeroDeLados());

        } else if (opcion == 2) {
            System.out.println("INGRESE CUANTO MIDE UN LADO DEL TRIANGULO EN CM");
            var scanner2 = new Scanner(System.in);
            Double lado;
            lado = Double.parseDouble(scanner2.nextLine());
            var triangulo = new Triangulo(lado);
                        System.out.println("La figura es :" + triangulo.nombreFigura()
                    + "\n su area es: " + triangulo.calcularArea()
                    + "\n su perímetro es: " + triangulo.calcularPerimetro()
                    + "\n " + triangulo.numeroDeLados());
        }else if (opcion ==3) {
            System.out.println("INGRESE CUANTO MIDE UN RADIO DEL CIRCULO");
            var scanner2 = new Scanner(System.in);
            Double radio;
            radio = Double.parseDouble(scanner2.nextLine());
            var circulo= new Circulo(radio);
                        System.out.println("La figura es :" + circulo.nombreFigura()
                    + "\n su area es: " + circulo.calcularArea()
                    + "\n su perímetro es: " + circulo.calcularPerimetro()
                    + "\n " + circulo.numeroDeLados());
            
        } 
        else {
            System.out.println("Opcion Incorrecta");
        }

    }

}
