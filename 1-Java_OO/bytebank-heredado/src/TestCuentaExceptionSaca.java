public class TestCuentaExceptionSaca {
    
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaCorriente(123, 321);
        cuenta.depositar(200);
        try {
            cuenta.retirar(400);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
