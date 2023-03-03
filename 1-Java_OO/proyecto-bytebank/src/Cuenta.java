public class Cuenta {
    private double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una nueva cuenta, cuentas creadas: " + Cuenta.total);

        Cuenta.total++;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean retirar(double valor) {
        if (valor > this.saldo) {
            System.out.println("No es posible retirar este monto");
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean transferir(double valor, Cuenta nuevaCuenta) {
        if (valor > this.saldo) {
            System.out.println("No es posible transferir este monto");
            return false;
        }
        this.saldo -= valor;
        nuevaCuenta.saldo += valor;
        return true;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0)
            this.agencia = agencia;
    }
    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        if (numero > 0)
            this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getTotal() {
        return Cuenta.total;
    }

}
