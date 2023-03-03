public class TestReferencia {
    public static void main(String[] args) {
        // solo se reserva memoria para un objeto
        Cuenta primeraCuenta = new Cuenta(1, 1223456);
        primeraCuenta.depositar(200);
        System.out.println("Saldo primera " + primeraCuenta.getSaldo());

        // segundo objeto apunta a la direccion en memoria del primer objeto
        // por eso son el mismo objeto.
        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.depositar(500);

        System.out.println("Saldo primera " + primeraCuenta.getSaldo());
        System.out.println("Saldo segunda " + segundaCuenta.getSaldo());

    }
}
