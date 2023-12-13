public class Main02 {
    public static void main(String[] args) {

        int n = 10;
        double a = 0.50;
        double b = 1.00;


        System.out.printf("%-10s%-15s%-15s\n", "№", "Аргумент (x)", "Значение функции");


        for (int i = 0; i < n; i++) {
            double x = a + (b - a) * i / (n - 1);
            double result = Math.exp((2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / x + (2 / 3)));

            System.out.printf("%-10d%-15.6f%-15.6f\n", i + 1, x, result);
        }
    }
}