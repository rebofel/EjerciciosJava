package figurasgeometricas;

import interfaz.IFiguraGeometrica;

public class Triangulo implements IFiguraGeometrica {

    Double lado;
    int lados = 3;

    public Triangulo(Double lado) {
        this.lado = lado;
    }

    @Override
    public String nombreFigura() {
        String nombre = "Triangulo";
        return nombre;
    }

    @Override
    public Double calcularArea() {
        Double area = (Math.sqrt(3) / 4) * (lado * lado);
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        var perimetro = lado * 3;
        return perimetro;
    }

    @Override
    public String numeroDeLados() {
        return "El triangulo tiene " + lados + " lados.";
    }

}
