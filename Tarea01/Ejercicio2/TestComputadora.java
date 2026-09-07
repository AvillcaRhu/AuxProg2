package Ejercicio2;
public class TestComputadora {

    public static void main(String[] args) {

        // Primera forma: constructor vacío
        Computadora c1 = new Computadora();

        // Segunda forma: constructor con parámetros
        Computadora c2 = new Computadora("Lenovo", 16, 512);

        System.out.println("COMPUTADORA 1");
        c1.mostrar();

        System.out.println("\nCOMPUTADORA 2");
        c2.mostrar();

        int x = 16;

        if (c2.ramIgualA(x)) {
            System.out.println("\nLa RAM de c2 es igual a " + x + " GB");
        }

        Computadora mayor = c1.mayorAlmacenamiento(c2);

        System.out.println("\nComputadora con mayor almacenamiento:");
        mayor.mostrar();
    }
}