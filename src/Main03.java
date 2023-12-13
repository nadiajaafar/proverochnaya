public class Main03 {


    public static void main(String[] args) {


        double x = 0.5;
        int n = 20;
        int sum = 0;

        for (int k = 0; k < n; k++) {

            double result = (Math.sin((x * x) / 2.0) + Math.sin((k * x - 1) / 2.0) / (Math.pow(Math.E, (x - 1) / k)));

            sum += result;

        }

        double result2 = Math.sqrt(n * Math.PI) * sum;

        System.out.println(result2);

    }


}