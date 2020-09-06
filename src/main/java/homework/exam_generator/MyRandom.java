package homework.exam_generator;

import java.util.Random;

public class MyRandom {

    private static Random random = new Random();

    public static double nextDouble(double a, double b){
        return roundAvoid(a + (b - a) * random.nextDouble(), 2);
    }

    public static double nextInt(int a, int b){
        return a + random.nextInt((b - a));
    }

    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

}
