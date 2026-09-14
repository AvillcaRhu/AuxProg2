public class TestAuto {

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Rojo", 20);
        System.out.println("=== AUTO 1 ===");
        auto1.mostrar();
        System.out.println("\n=== AUTO 2 ===");
        auto2.mostrar();
        auto1.incrementarGasolina();
        auto1.cambiarColor("Azul");
        System.out.println("\n=== AUTO 1 DESPUES DE CAMBIOS ===");
        auto1.mostrar();
        double total = auto1.sumarGasolina(auto2);
        System.out.println("\nGasolina total de los dos autos: "
                + total + " litros");
    }
}