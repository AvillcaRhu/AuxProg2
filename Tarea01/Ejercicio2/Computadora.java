package Ejercicio2;
public class Computadora {

    private String marca;
    private int ram;
    private int almacenamiento;

    // Constructor vacío
    public Computadora() {
        marca = "Desconocida";
        ram = 0;
        almacenamiento = 0;
    }

    // Constructor con parámetros
    public Computadora(String marca, int ram, int almacenamiento) {
        this.marca = marca;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public boolean ramIgualA(int x) {
        return ram == x;
    }

    public Computadora mayorAlmacenamiento(Computadora c) {

        if (this.almacenamiento > c.almacenamiento) {
            return this;
        } else {
            return c;
        }
    }

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
    }
}
