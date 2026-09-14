public class Auto {

    private String color;
    private double gasolina;

    public Auto() {
        color = "Blanco";
        gasolina = 0;
    }
    public Auto(String color, double gasolina) {
        this.color = color;
        this.gasolina = gasolina;
    }
    public void incrementarGasolina() {
        gasolina = gasolina + 5;
    }
    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
    }
    public double sumarGasolina(Auto otro) {
        return gasolina + otro.gasolina;
    }
    public void mostrar() {
        System.out.println("Color: " + color);
        System.out.println("Gasolina: " + gasolina + " litros");
    }
}