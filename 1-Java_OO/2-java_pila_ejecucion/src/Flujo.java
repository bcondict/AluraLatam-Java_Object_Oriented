public class Flujo {
    public static void main(String[] args) {
        System.out.println("Inicio de main");
        metodo1();
        System.out.println("Fin main");
    }

    private static void metodo1() {
        System.out.println("inicio de metodo1");
        // /*
        try {
            metodo2();
        } catch (MiException me) {
            // System.out.println("Exception: " + e.getMessage());
            me.printStackTrace();
        }
        // */
        // metodo2();
        System.out.println("Fin metodo1");
    }

    private static void metodo2 () throws MiException {
    // private static void metodo2 () {
        System.out.println("inicio de metodo2");
        // ArithmeticException ae = new ArithmeticException();

        /* unicamente puedes usar throw con objetos de excetion
         * todo debajo de thwrow no se ejecuta
        */
        // throw new ArithmeticException();
        // System.out.println("Fin metodo2");

        /*  metodo2(); // StackOverflowError */
        throw new MiException("Mi excepcion fue lanzada");
    }
}
