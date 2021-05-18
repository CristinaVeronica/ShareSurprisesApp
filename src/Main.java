import bags.BagFactory;
import giveSurprises.GiveSurpriseAndHug;
import giveSurprises.GiveSurpriseAndSing;
import surprises.GatherSurprises;
import surprises.ISurprise;
import giveSurprises.AbstractGiveSurprises;
import giveSurprises.GiveSurpriseAndApplause;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        random();
        System.out.println();
        fifo();
        System.out.println();
        lifo();
    }

    public static void random () {
        System.out.println("======= STARTS RANDOM =======");
        ArrayList<ISurprise> surprises = GatherSurprises.gather(5);
        ISurprise surprise = GatherSurprises.gather();

        BagFactory bag1 = new BagFactory();
        var randomBag =  bag1.makeBag("random");

        randomBag.put(surprise);
        System.out.println();

        for (int i = 0; i < surprises.size(); i++) {
            randomBag.put(surprises.get(i));
            System.out.println("[MAIN.RANDOM]: " + "Step " + (i + 1) + ": " + surprises.get(i).toString());
        }

        System.out.println("[MAIN.RANDOM]: Initialize surprises.GiveSurpriseAndApplause");
        AbstractGiveSurprises giveSurprise1 = new GiveSurpriseAndApplause("random", 3);
        System.out.println("[MAIN.RANDOM]: ===== STARTING copying surprises from random to Bag =====");
        giveSurprise1.put(randomBag);
        System.out.println("[MAIN.RANDOM]: ===== ENDING copying surprises  =====");

        System.out.println("[MAIN.RANDOM]: surprises.GiveSurpriseAndApplause.GiveWithPassion");
        giveSurprise1.giveWithPassion();

        System.out.println();
        System.out.println("=========== RANDOM - SCENARIO 2 ============");
        ISurprise s1 = GatherSurprises.gather();
        ISurprise s2 = GatherSurprises.gather();
        ISurprise s3 = GatherSurprises.gather();

        AbstractGiveSurprises gs1 = new GiveSurpriseAndHug("random", 3);
        System.out.println("[MAIN.RANDOM]: Trying to give a surpise....");
        gs1.give();
        System.out.println("[MAIN.RANDOM]: Adding surprises to bag....");
        gs1.put(s1);
        gs1.put(s2);
        gs1.put(s3);
        System.out.println("[MAIN.RANDOM]: Trying to give a random surprise....");
        gs1.give();
        System.out.println();
    }

    public static void fifo() {
        GatherSurprises.clearAll();
        System.out.println("======= STARTS FIFO =======");
        ArrayList<ISurprise> surprises2 = GatherSurprises.gather(4);
        ISurprise surprise = GatherSurprises.gather();

        BagFactory bag2 = new BagFactory();
        var fifoBag = bag2.makeBag("fifo");

        fifoBag.put(surprise);
        System.out.println();

        for (int i = 0; i < surprises2.size(); i++) {
            fifoBag.put(surprises2.get(i));
            System.out.println("[MAIN.FIFO]: " + "Step " + (i + 1) + ": " + surprises2.get(i).toString());
        }
        System.out.println();

        System.out.println("[MAIN.FIFO]: Initialize surprises.GiveSurpriseAndApplause");
        AbstractGiveSurprises giveSurprise2 = new GiveSurpriseAndHug("fifo", 3);
        System.out.println();
        System.out.println("[MAIN.FIFO]: ===== STARTING copying surprises from fifo to Bag =====");
        giveSurprise2.put(fifoBag);
        System.out.println("[MAIN.FIFO]: ===== ENDING copying surprises from fifo to Bag =====");
        System.out.println();

        System.out.println("[MAIN.FIFO]: surprises.GiveSurpriseAndApplause.GiveWithPassion");
        giveSurprise2.giveWithPassion();

        System.out.println();
        System.out.println("=========== FIFO - SCENARIO 2 ============");
        AbstractGiveSurprises gs1 = new GiveSurpriseAndSing("fifo", 2);
        ISurprise s1 = GatherSurprises.gather();
        ISurprise s2 = GatherSurprises.gather();
        ISurprise s3 = GatherSurprises.gather();

        System.out.println("[MAIN.FIFO]: Adding surprises to bag....");
        gs1.put(s1);
        gs1.put(s2);
        gs1.put(s3);
        System.out.println("[MAIN.FIFO]: Trying to give a fifo surprise....");
        gs1.giveWithPassion();
    }

    public static void lifo() {
        GatherSurprises.clearAll();
        System.out.println("======= STARTS LIFO =======");
        System.out.println();
        BagFactory bag3 = new BagFactory();
        var lifoBag = bag3.makeBag("lifo");

        ArrayList<ISurprise> surprises = GatherSurprises.gather(6);
        ISurprise surprise3 = GatherSurprises.gather();

        lifoBag.put(surprise3);
        System.out.println();

        for (int i = 0; i < surprises.size(); i++) {
            lifoBag.put(surprises.get(i));
            System.out.println("[MAIN.LIFO]: " + "Step " + (i + 1) + ": " + surprises.get(i).toString());
        }

        System.out.println("[MAIN.LIFO]: Initialize surprises.GiveSurpriseAndApplause");
        AbstractGiveSurprises giveSurprise3 = new GiveSurpriseAndSing("lifo", 3);
        System.out.println();
        System.out.println("[MAIN.LIFO]: ===== STARTING copying surprises from lifo to Bag =====");
        giveSurprise3.put(lifoBag);
        System.out.println("[MAIN.LIFO]: ===== ENDING copying surprises from lifo to Bag =====");
        System.out.println();

        System.out.println("[MAIN.LIFO]: surprises.GiveSurpriseAndApplause.GiveWithPassion");
        giveSurprise3.giveWithPassion();

        System.out.println();
        System.out.println("=========== LIFO - SCENARIO 2 ============");
        AbstractGiveSurprises gs1 = new GiveSurpriseAndApplause("lifo", 2);
        ISurprise s1 = GatherSurprises.gather();
        ISurprise s2 = GatherSurprises.gather();
        ISurprise s3 = GatherSurprises.gather();

        System.out.println("[MAIN.LIFO]: Adding surprises to bag....");
        gs1.put(s1);
        gs1.put(s2);
        gs1.put(s3);
        System.out.println("[MAIN.LIFO]: Trying to give a fifo surprise....");
        gs1.giveWithPassion();

        System.out.println();
        System.out.println("=========== LIFO - SCENARIO 3  ============");
        BagFactory bag4 = new BagFactory();
        var fifoBag = bag4.makeBag("fifo");
        ISurprise s4 = GatherSurprises.gather();
        ISurprise s5 = GatherSurprises.gather();
        fifoBag.put(s4);
        fifoBag.put(s5);
        AbstractGiveSurprises gs2 = new GiveSurpriseAndHug("lifo", 3);
        System.out.println();
        System.out.println("[MAIN.LIFO]: ===== STARTING copying surprises from fifo to lifo Bag =====");
        gs2.put(fifoBag);
        System.out.println("[MAIN.LIFO]: ===== ENDING copying surprises from lifo to Bag =====");
        System.out.println();

        gs2.giveWithPassion();

    }
}
