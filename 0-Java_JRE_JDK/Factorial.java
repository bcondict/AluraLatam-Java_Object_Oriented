public class Factorial {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(cal_factorial(num));
    }

    public static int cal_factorial(int n) {
        int i = 0;
        int factorial_val = 1;

        for (i = 1; i < n + 1; i++)
        {
            factorial_val = factorial_val * i;
        }
        return factorial_val;
    }
}
