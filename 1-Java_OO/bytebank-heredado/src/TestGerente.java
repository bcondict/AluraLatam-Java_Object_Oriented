public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        // Funcionario gerente = new Funcionario();
        // gerente.setSalario(5000);
        gerente.setClave("AluraCursosOnlie");
        // gerente.setTipo(1);
        // System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
    }
}
