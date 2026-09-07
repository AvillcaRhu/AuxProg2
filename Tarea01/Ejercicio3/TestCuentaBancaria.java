package Ejercicio3;
public class TestCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuenta =
                new CuentaBancaria("Azael", "123456", 1000);

        cuenta.mostrar();

        System.out.println("\n--- Depositando Bs. 500 ---");
        cuenta.depositar(500);

        cuenta.mostrar();

        System.out.println("\n--- Retirando Bs. 200 ---");
        cuenta.retirar(200);

        cuenta.mostrar();

        System.out.println("\n--- Intentando retirar Bs. 2000 ---");
        cuenta.retirar(2000);

        System.out.println("\n--- Intentando depositar Bs. 0 ---");
        cuenta.depositar(0);
    }
}