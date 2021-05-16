import bags.BagFactory;
import surprises.GatherSurprises;
import surprises.ISurprise;
import giveSurprises.AbstractGiveSurprises;
import giveSurprises.GiveSurpriseAndApplause;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
       // random();
        fifo();
        lifo();
    }

    public static void random () {
        System.out.println("======= STARTS RANDOM =======");
        ArrayList<ISurprise> surprises = GatherSurprises.gather(5);
        ISurprise surprise = GatherSurprises.gather();

        BagFactory bag1 = new BagFactory();
        var randomBag =  bag1.makeBag("random");

        randomBag.put(surprise);

        for (int i = 0; i < surprises.size(); i++) {
            randomBag.put(surprises.get(i));
            System.out.println("[MAIN.RANDOM]: " + "Step " + (i + 1) + ": " + surprises.get(i).toString());
        }

        System.out.println("[MAIN.RANDOM]: Initialize surprises.GiveSurpriseAndApplause");
        AbstractGiveSurprises giveSurprise1 = new GiveSurpriseAndApplause("random", 3);
        giveSurprise1.put(randomBag);

        System.out.println("[MAIN.RANDOM]: surprises.GiveSurpriseAndApplause.GiveWithPassion");
        giveSurprise1.giveWithPassion();
    }

    public static void fifo() {
        GatherSurprises.clearAll();
        System.out.println("======= STARTS FIFO =======");
        ArrayList<ISurprise> surprises2 = GatherSurprises.gather(5);
        ISurprise surprise = GatherSurprises.gather();

        BagFactory bag2 = new BagFactory();
        var fifoBag = bag2.makeBag("fifo");

        // fifoBag.put(surprise);

        for (int i = 0; i < surprises2.size(); i++) {
            fifoBag.put(surprises2.get(i));
            System.out.println("[MAIN.FIFO]: " + "Step " + (i + 1) + ": " + surprises2.get(i).toString());
        }

        System.out.println("[MAIN.FIFO]: Initialize surprises.GiveSurpriseAndApplause");
        AbstractGiveSurprises giveSurprise2 = new GiveSurpriseAndApplause("fifo", 3);
        giveSurprise2.put(fifoBag);

        System.out.println("[MAIN.FIFO]: surprises.GiveSurpriseAndApplause.GiveWithPassion");
        giveSurprise2.giveAll();
    }

    public static void lifo() {
        GatherSurprises.clearAll();
        System.out.println("======= STARTS LIFO =======");
        BagFactory bag3 = new BagFactory();
        var lifoBag = bag3.makeBag("lifo");
        AbstractGiveSurprises giveSurprise3 = new GiveSurpriseAndApplause("lifo", 3);
    }
}
