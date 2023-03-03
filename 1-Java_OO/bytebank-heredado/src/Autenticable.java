public interface Autenticable {

    // private String clave;

    // Interface no puede tener metodos implementados
    /*
    public void setClave(String clave) {
        this.clave = clave;
        System.out.println("su clave es: " + this.clave);
    }
    
    public boolean inciarSesion(String clave) {
        return clave == "AluraCursosOnline"; 
    }
    */
    public void setClave(String clave);
    public boolean iniciarSesion(String clave);

}
