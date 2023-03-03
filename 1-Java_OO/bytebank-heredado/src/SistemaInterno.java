public class SistemaInterno {

    String clave = "AluraCursosOnline"; 

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean autentica(Autenticable gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login exitoso");
            return puedeIniciarSesion;
        }
        System.out.println("Error en login");
        return puedeIniciarSesion;
    }
}
