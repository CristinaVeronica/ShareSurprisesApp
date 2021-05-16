package bags;

public class BagFactory implements IBagFactory {

    @Override
    public IBag makeBag(String type) {
        switch(type) {
            case "random":
                return new RandomBag();
            case "fifo":
                return new FifoBag();
            case "lifo":
                return new LifoBag();
        }
        return  null;
    }
}
