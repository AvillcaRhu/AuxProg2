package Ejercicio4;
public class TestBus {

    public static void main(String[] args) {

        Bus bus = new Bus(40);

        bus.mostrar();

        System.out.println("\n--- Suben pasajeros ---");
        bus.subirPasajeros(15);

        System.out.println("\n--- Cobro de pasajes ---");
        bus.cobrarPasaje();

        System.out.println("\n--- Asientos disponibles ---");
        bus.asientosDisponibles();

        System.out.println("\n--- Intentando subir 30 pasajeros ---");
        bus.subirPasajeros(30);

        bus.asientosDisponibles();
    }
}