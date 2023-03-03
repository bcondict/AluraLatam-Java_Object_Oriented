public class Contador extends Funcionario{

    // override estaba para sobreescribir y asegurarse de 6
    @Override
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE CONTADOR");
        return 200;
    }
}
