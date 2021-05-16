package surprises;

import surprises.Candies;
import surprises.FortuneCookie;
import surprises.ISurprise;
import helpers.Utils;
import surprises.MinionToy;

import java.util.ArrayList;

public final class GatherSurprises {
    private GatherSurprises() {}

    private static ArrayList<ISurprise> surprises = new ArrayList<>();

    public static ArrayList<ISurprise> gather(int n) {
        for (int i = 0; i < n; i++) {
            int number = Utils.generateRandomNumber(3);
            if (number == 0) {
                surprises.add(FortuneCookie.generate());
            } else if (number == 1) {
                surprises.add(Candies.generate());
            } else {
                surprises.add(MinionToy.generate());
            }
        }
        return surprises;
    }

    public static ISurprise gather() {
        int number = Utils.generateRandomNumber(3);
        switch (number) {
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
            default:
                System.out.println("Numarul introdus nu este valid!");
                break;
        }
        return null;
    }

    public static void clearAll() {
        surprises.removeAll(surprises);
    }
}
