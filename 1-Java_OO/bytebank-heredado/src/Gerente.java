public class Gerente extends Funcionario implements Autenticable {

    @Override
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return super.getSalario() + this.getBonificacion();
        // return 200;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return true;
    }

    @Override
    public void setClave(String clave) {
        
    }
}
