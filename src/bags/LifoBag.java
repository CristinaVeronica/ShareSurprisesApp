package bags;

import bags.IBag;
import surprises.ISurprise;

import java.util.ArrayList;

public class LifoBag implements IBag {
    private ArrayList<ISurprise> lifoBag = new ArrayList<>();
    private ArrayList<IBag> lifoBags = new ArrayList<>();

    @Override
    public void put(ISurprise surprise) {
        lifoBag.add(surprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        lifoBags.add(bagOfSurprises);
    }

    @Override
    public ISurprise takeOut() {
        ISurprise surprise = null;
        if (!lifoBag.isEmpty()) {
            int index = lifoBag.size()-1;
            surprise = lifoBag.get(index);
            System.out.println(surprise);
            lifoBag.remove(index);
        }
        return surprise;
    }

    @Override
    public boolean isEmpty() {
        return lifoBag.isEmpty();
    }

    @Override
    public int size() {
        return lifoBag.size();
    }

    @Override
    public void display(){
        for (int i = 0; i < lifoBag.size(); i++) {
            System.out.println(lifoBag.get(i));
        }
    }
}
