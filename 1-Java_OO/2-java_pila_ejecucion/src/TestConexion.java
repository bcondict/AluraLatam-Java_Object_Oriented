public class TestConexion {
    public static void main(String[] args) throws Exception {

        /* tipo 1 de try/except  */
        /*
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            conexion.leerDatos();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Se ejecuta siempre");
            if (conexion != null)
                conexion.cerrar();
        }
        */  

        try (Conexion conexion = new Conexion()) {
            conexion.leerDatos();
        }
        catch (IllegalStateException e) {
            System.out.println("ejecutando catch");
            e.printStackTrace();
        }
    }
}
