public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(2, 1234546);
        miCuenta.depositar(200);
        miCuenta.depositar(300);
        System.out.println("Mi saldo es: " + miCuenta.getSaldo());
        // miCuenta.retirar(600);
        // System.out.println(miCuenta.saldo);

        Cuenta cuentaJimena = new Cuenta(3, 12334455);
        cuentaJimena.depositar(1000);
        System.out.println("Saldo de Jimena es: " + cuentaJimena.getSaldo());

        miCuenta.transferir(200, cuentaJimena);
        System.out.println("Mi saldo es: " + miCuenta.getSaldo());
        System.out.println("Saldo de Jimena es: " + cuentaJimena.getSaldo());
    }
}
