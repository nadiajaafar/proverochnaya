public class Main05 {
    public static void main(String[] args) {


        double A = 1.0;

        double x1 = -2 * A;

        double dX = A / 5;

        int N = 6;

        double y = 0;

        for (int i = 0; i < N; i++) {

            x1 += dX;

            if (x1 <= 0) {

                y = A / 2 * Math.exp(x1 / A) + Math.exp(-x1 / A);

            } else {

                y = 4 * Math.pow(A, 3) / (Math.pow(x1, 2) + 4 * Math.pow(A, 2));

            }
            System.out.println("y = " + y);


        }
    }


}

