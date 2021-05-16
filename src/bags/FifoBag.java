package bags;

import surprises.ISurprise;

import java.util.ArrayList;

public class FifoBag implements IBag {

    private ArrayList<ISurprise> fifoBagSurprises = new ArrayList<>();
    //private ArrayList<IBag> fifoBags = new ArrayList<>();

    @Override
    public void put(ISurprise surprise) {
        fifoBagSurprises.add(surprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()) {
            ISurprise surprise = bagOfSurprises.takeOut();
            fifoBagSurprises.add(surprise);
        }
    }

    @Override
    public ISurprise takeOut() {
        ISurprise surprise = null;
        if (!fifoBagSurprises.isEmpty()) {
            surprise = fifoBagSurprises.get(0);
            System.out.println(surprise);
            fifoBagSurprises.remove(0);
        }
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
    public void display(){
        for (int i = 0; i < fifoBagSurprises.size(); i++) {
            System.out.println(fifoBagSurprises.get(i));
        }
    }
}
