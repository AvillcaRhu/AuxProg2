package Ejercicio1;
public class TestAuto {

    public static void main(String[] args) {

        Auto a1 = new Auto("Rojo", 125.5);
        Auto a2 = new Auto("Azul", 230.75);

        a1.cambiarColor("Negro");
        a2.cambiarColor("Blanco");

        System.out.println("AUTO 1");
        a1.mostrarDatos();

        System.out.println("\nAUTO 2");
        a2.mostrarDatos();
    }
}