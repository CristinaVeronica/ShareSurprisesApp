package bags;

import bags.IBag;
import surprises.ISurprise;

import java.util.ArrayList;

public class LifoBag implements IBag {
    private ArrayList<ISurprise> lifoBagSurprises = new ArrayList<>();
    //private ArrayList<IBag> lifoBags = new ArrayList<>();

    @Override
    public void put(ISurprise surprise) {
        lifoBagSurprises.add(surprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        int counter = bagOfSurprises.size();
        while (counter > 0) {
            System.out.println("[LIFO_BAG.PUT[bag]]: Copying surprise from Bag to LifoBag");
            ISurprise surprise = bagOfSurprises.takeOut();
            lifoBagSurprises.add(surprise);
            counter--;
        }
    }

    @Override
    public ISurprise takeOut() {
        if (lifoBagSurprises.isEmpty()) {
            System.out.println("[LIFO_BAG.TAKE_OUT]: Empty list");
            return null;
        }
            int index = lifoBagSurprises.size()-1;
            ISurprise surprise = lifoBagSurprises.get(index);
            lifoBagSurprises.remove(index);
             System.out.println("[LIFO_BAG.TAKE_OUT]: " + surprise.toString());
        return surprise;
    }

    @Override
    public boolean isEmpty() {
        return lifoBagSurprises.isEmpty();
    }

    @Override
    public int size() {
        return lifoBagSurprises.size();
    }

    @Override
    public void display(){
        for (int i = 0; i < lifoBagSurprises.size(); i++) {
            System.out.println(lifoBagSurprises.get(i));
        }
    }
}
