package Ejercicio3;
public class CuentaBancaria {

    private String titular;
    private String nroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String nroCuenta, double saldo) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("Error: El depósito debe ser mayor a 0.");
        } else {
            saldo = saldo + cantidad;
            System.out.println("Depósito realizado correctamente.");
        }
    }

    public void retirar(double cantidad) {

        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a 0.");
        } else if (cantidad > saldo) {
            System.out.println("Error: No hay suficiente dinero en la cuenta.");
        } else {
            saldo = saldo - cantidad;
            System.out.println("Retiro realizado correctamente.");
        }
    }

    public void mostrar() {
        System.out.println("Titular: " + titular);
        System.out.println("Nro. Cuenta: " + nroCuenta);
        System.out.println("Saldo: Bs. " + saldo);
    }
}