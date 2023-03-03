public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(2, 123455);
        // cuenta.saldo = 200;
        cuenta.depositar(500);
        cuenta.retirar(300);
        // cuenta.saldo = cuenta.saldo - 300;
    }
}
