/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

import interfaz.IFiguraGeometrica;

/**
 *
 * @author admin
 */
public class Circulo implements IFiguraGeometrica {
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }
    

    @Override
    public String nombreFigura() {
        String nombre = "Círculo";
        return nombre; 
    }

    @Override
    public Double calcularArea() {
        Double area = Constantes.VALOR_PI*(radio*radio);
        return area; 
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro = (Constantes.VALOR_PI*2) * radio; 
        return perimetro; 
    }

    @Override
    public String numeroDeLados() {
        return"El circulo no tiene lados";
    }

    public Double getRadio() {
        return this.radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
}
