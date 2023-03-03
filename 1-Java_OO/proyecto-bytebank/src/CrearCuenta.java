public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1, 123456);
        primeraCuenta.depositar(600);

        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(1, 1234566);
        segundaCuenta.depositar(500);
        // System.out.println(segundaCuenta.saldo);
    }
}
