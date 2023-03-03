public class TestSalario {

    public static void main(String[] args) {

        double salario = 3300.0;
        // ifs aqui
        if (salario > 1900.0 && salario < 2800.0)
            System.out.println("Paga:" + salario * .075);
        if (salario > 2800.01 && salario < 3751.0)
            System.out.println("Paga:" + salario * .15);
        if (salario > 3751.01 && salario < 4664.0)
            System.out.println("Paga:" + salario * .225);

    }
}
