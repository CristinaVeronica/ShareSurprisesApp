package giveSurprises;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {
    public GiveSurpriseAndSing(String type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    public void giveWithPassion(){
        super.give();
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
