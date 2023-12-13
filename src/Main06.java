public class Main06 {

    public static void main(String[] args) {


        int n = 0;

        double A = 3 * Math.pow(10, 3);
        double B = 6 * Math.pow(10, 4);

        double M = 4;

        double t1 = Math.sqrt(A + B + M);
        double t2 = M * Math.sqrt(A + B);
        double t3 = Math.sqrt(A * B * M);
        double t4 = M * Math.sqrt(A * B);


        for ( int K= -30; K<60; K++){

                double f = (Math.pow(K, 3) - 25 * Math.pow(K, 2) + 50 * K + 1000);

                if (f >= t1 && f <= t2 || f >= t3 && f <= t4) {
                    System.out.println("f(" + K + ") = " + f);
                } else n++;
            }
            System.out.println(n + " значений не соответствуют условию");


        }
    }

