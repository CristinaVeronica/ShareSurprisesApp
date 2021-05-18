package giveSurprises;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {
    public GiveSurpriseAndHug(String type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    public void giveWithPassion(){
        giveAll();
        System.out.println("[GIVE_SURPRISE_AND_HUG.GIVE_WITH_PASSION]: Warm wishes and a big hug!");
    }
}
