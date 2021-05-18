package giveSurprises;

import bags.FifoBag;
import bags.LifoBag;
import bags.RandomBag;
import bags.IBag;
import surprises.ISurprise;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    IBag bagInstance;
    int waitTime;

    public AbstractGiveSurprises(String type, int waitTime) {
        if (type.equalsIgnoreCase("random")) {
            this.bagInstance = new RandomBag();
        } else if (type.equalsIgnoreCase("fifo")) {
            this.bagInstance = new FifoBag();
        } else {
            this.bagInstance = new LifoBag();
        }
        this.waitTime = waitTime;
    }

    public void put(ISurprise newSurprise) {
        this.bagInstance.put(newSurprise);
    }

    public void put(IBag surprises) {
        while (!surprises.isEmpty()) {
            ISurprise surprise = surprises.takeOut();
            this.bagInstance.put(surprise);
        }
    }

    public void give() {
        this.bagInstance.takeOut();
    }

    public void giveAll() {
        try {
            System.out.println("[ABSTRACT_GIVE_SURPRISES.GIVE_ALL]: The bag of type " +
                    this.bagInstance.getClass().getTypeName() +
                    " and has " + this.bagInstance.size() + " elements");
            while (!this.bagInstance.isEmpty()) {
                TimeUnit.SECONDS.sleep(2);

                this.bagInstance.takeOut();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isEmpty() {
        return this.bagInstance.isEmpty();
    }

    public abstract void giveWithPassion();
}
