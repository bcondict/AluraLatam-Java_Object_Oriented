public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("12039821");
        diego.setTelefono("1928301");

        Cuenta cuentaDiego = new Cuenta(2, 123455);
        cuentaDiego.setAgencia(1);
        // cuentaDiego.titular = diego;
        cuentaDiego.setTitular(diego);

        System.out.println();
    }
}
