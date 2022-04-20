/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

import interfaz.IFiguraGeometrica;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Cuadrado implements IFiguraGeometrica {

    final int lados = 4;
    Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;

    }

    @Override
    public String nombreFigura() {
        var nombre = "Cuadrado";
        return nombre;
    }

    @Override
    public Double calcularArea() {
        var area = lado * lado;
        return area;

    }

    @Override
    public Double calcularPerimetro() {
        var perimetro = lado * lados;
        return perimetro;
    }

    @Override
    public String numeroDeLados() {
        return "Tiene " + lados + " lados.";

    }

}
