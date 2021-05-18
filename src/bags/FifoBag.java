package bags;

import surprises.ISurprise;

import java.util.ArrayList;

public class FifoBag implements IBag {

    private final ArrayList<ISurprise> fifoBagSurprises = new ArrayList<>();

    @Override
    public void put(ISurprise surprise) {
        fifoBagSurprises.add(surprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        int counter = bagOfSurprises.size();
        while (counter > 0) {
            System.out.println("[FIFO_BAG.PUT[bag]]: Copying surprise from Bag to FifoBag");
            ISurprise surprise = bagOfSurprises.takeOut();
            fifoBagSurprises.add(surprise);
            counter--;
        }
    }

    @Override
    public ISurprise takeOut() {
        if (fifoBagSurprises.isEmpty()) {
            System.out.println("[FIFO_BAG.TAKE_OUT]: Empty list");
            return null;
        }

        ISurprise surprise = fifoBagSurprises.get(0);
        fifoBagSurprises.remove(0);
        System.out.println("[FIFO_BAG.TAKE_OUT]: " + surprise.toString());

        return surprise;
    }

    @Override
    public boolean isEmpty() {
        return fifoBagSurprises.isEmpty();
    }

    @Override
    public int size() {
        return fifoBagSurprises.size();
    }

    @Override
    public void display() {
        for (int i = 0; i < fifoBagSurprises.size(); i++) {
            System.out.println(fifoBagSurprises.get(i));
        }
    }
}
