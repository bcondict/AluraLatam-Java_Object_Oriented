public class Conexion implements AutoCloseable{

    public Conexion() {
        System.out.println("Abriendo una conexión a la base de datos");
        // throw new IllegalStateException();
    }

    public void leerDatos() {
        System.out.println("Seleccionar * from usuarios");
        throw new IllegalStateException();
    }

    public void cerrar() {
        System.out.println("Cerrando la conexión");
    }

    @Override
    public void close() throws Exception {
        // throw new UnsupportedOperationException("Unimplemented method 'close'");
        cerrar();
    }
}
