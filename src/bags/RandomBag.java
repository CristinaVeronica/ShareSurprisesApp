package bags;

import bags.IBag;
import surprises.ISurprise;
import helpers.Utils;

import java.util.ArrayList;

public class RandomBag implements IBag {
    private final ArrayList<ISurprise> randomBagSurprises = new ArrayList<>();
    private final ArrayList<IBag> randomBagOfBags = new ArrayList<>();

    @Override
    public void put(ISurprise surprise) {
        int position = Utils.generateRandomNumber(randomBagSurprises.size());
        randomBagSurprises.add(position, surprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        int position = Utils.generateRandomNumber(bagOfSurprises.size());
        randomBagOfBags.add(position, bagOfSurprises);
    }

    @Override
    public ISurprise takeOut() {
        if (randomBagSurprises.isEmpty()) {
            System.out.println("[RANDOM_BAG.TAKE_OUT]: Empty list");
            return null;
        }

        int position = Utils.generateRandomNumber(randomBagSurprises.size());
        ISurprise surprise = randomBagSurprises.get(position);
        randomBagSurprises.remove(surprise);
        System.out.println("[RANDOM_BAG.TAKE_OUT]: " + surprise.toString());

        return surprise;
    }

    @Override
    public boolean isEmpty() {
        return randomBagSurprises.isEmpty();
    }

    @Override
    public int size() {
        return randomBagSurprises.size();
    }

    @Override
    public void display() {
        for (int i = 0; i < randomBagSurprises.size(); i++) {
            System.out.println(randomBagSurprises.get(i));
        }
    }

    @Override
    public String toString() {
        return "This is a random bag!";
    }
}
