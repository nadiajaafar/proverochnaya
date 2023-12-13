public class Main04 {

    public static void main(String[] args) {
        double x1 = -2.0;
        double y1 = 2.0;
        double x2 = 2.0;
        double y2 = -1.0;

        int n = 10;
        double[] xPoints = {0.5, -1.0, -2.0, -1.0, 1.5, 3.0, 2.7, 1.2, 5.5, 6.0};
        double[] yPoints = {0.5, 1.0, -2.0, 2.0, 2.5, 2.0, 2.3, 1.2, 6.5, 7.0};

        int pointsInside = 0;

        for (int i = 0; i < n; i++) {
            double x = xPoints[i];
            double y = yPoints[i];

            boolean insideRectangle = (x >= -2 && x <= 0) && (y <= 2 && y >= 0) || (x >= 0 && x <= 2) && (y >= -1 && y <= 1);

            if (insideRectangle) {
                pointsInside++;
            }

            System.out.printf("Point %d: (%.2f, %.2f) - Inside Rectangle: %b\n", i + 1, x, y, insideRectangle);
        }

        System.out.println("Points inside the rectangle: " + pointsInside);
    }
}

