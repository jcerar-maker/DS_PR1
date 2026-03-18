package edu.uoc.ds.adt.util;

public class SpiralGenerator {

    public static Point[] generate(double a, double b, double thetaMax, double step) {
        int size;
        size = (int)(thetaMax / step) + 1;
        Point[] res = new Point[size];

        double theta;
        theta = 0;

        for (int i = 0; i < size; i++) {
            double r = a + b * theta;
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            res[i] = new Point(x, y);
            theta = theta + step;

        }
        return res;
    }
}
