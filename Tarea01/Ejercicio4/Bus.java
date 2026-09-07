package Ejercicio4;
public class Bus {

    private int capacidad;
    private int pasajeros;
    private double precioPasaje;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.precioPasaje = 1.50;
    }

    public void subirPasajeros(int cantidad) {

        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a 0.");
        } else if (pasajeros + cantidad > capacidad) {
            System.out.println("Error: No hay suficientes asientos.");
        } else {
            pasajeros = pasajeros + cantidad;
            System.out.println(cantidad + " pasajeros subieron al bus.");
        }
    }

    public double cobrarPasaje() {

        double total = pasajeros * precioPasaje;

        System.out.println("Total recaudado: Bs. " + total);

        return total;
    }

    public void asientosDisponibles() {

        int disponibles = capacidad - pasajeros;

        System.out.println("Asientos disponibles: " + disponibles);
    }

    public void mostrar() {

        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pasajeros: " + pasajeros);
        System.out.println("Precio del pasaje: Bs. " + precioPasaje);
    }
}
