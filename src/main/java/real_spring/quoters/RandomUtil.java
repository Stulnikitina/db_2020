package real_spring.quoters;

import java.util.Random;

public class RandomUtil {
    public static Random random = new Random();

    public static int getIntBetween(int min, int max) {
        return random.nextInt(max - min) + min;
    }
}
