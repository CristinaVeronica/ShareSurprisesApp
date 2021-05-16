package helpers;

import java.util.Random;

public class Utils {
    public static int generateRandomNumber(int range) {
        if (range == 0) {
            return 0;
        }

        Random random = new Random();
        int n = Math.abs(random.nextInt(range));
        return n;
    }

}
