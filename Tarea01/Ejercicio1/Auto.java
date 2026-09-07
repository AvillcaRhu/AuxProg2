package Ejercicio1;

public class Auto {

    private String color;
    private double kilometraje;

    public Auto(String color, double kilometraje) {
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public void mostrarKilometraje() {
        int kilometros = (int) kilometraje;
        double metros = (kilometraje - kilometros) * 1000;

        System.out.println("Kilometraje: " + kilometros + " km y "
                + metros + " metros");
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public void mostrarDatos() {
        System.out.println("Color: " + color);
        mostrarKilometraje();
    }
}