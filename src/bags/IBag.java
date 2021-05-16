package bags;

import surprises.ISurprise;

public interface IBag {
    void put(ISurprise surprise);
    void put(IBag bagOfSurprises);
    ISurprise takeOut();
    boolean isEmpty();
    int size();
    void display();
}
