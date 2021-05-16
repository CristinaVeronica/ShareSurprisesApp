package giveSurprises;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

    public GiveSurpriseAndApplause(String type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    public void giveWithPassion(){
        giveAll();
        System.out.println("[GIVE_SURPRISE_AND_APPLAUSE.GIVE_WITH_PASSION]: Loud applause to you… For it is in giving that we receive.");
    }
}
