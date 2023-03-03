public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDiego = new Cuenta(2, 123451);
        Cliente cliente = new Cliente();

        // cuentaDiego.titular = cliente;
        cuentaDiego.setTitular(cliente);
        System.out.println(cuentaDiego.getTitular().getNombre());
    }
}
