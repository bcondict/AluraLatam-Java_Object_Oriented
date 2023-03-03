public class TestReferencias {

    public static void main(String[] args) {

        // el elemento mas generico puede ser adaptado 
        // al elemento mas especifico
        // Funcionario funcionario = new Funcionario();
        Funcionario funcionario = new Contador();
        /* Funcionario otroFuncionario = new Gerente();*/
        funcionario.setNombre("Diego");

        // pero no al contrario
        /*Gerente otroGerente = new Funcionario(); */
        
        /*
        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");
        otroFuncionario.setNombre("Juan");
        */


        // No significa que porque es genrente hereda las funciones interas
        // porque es un tipo funcionario
        /* otroFuncionario.setClave("hola"); */

        funcionario.setSalario(2000);
        /*gerente.setSalario(10000); */
    }

}
