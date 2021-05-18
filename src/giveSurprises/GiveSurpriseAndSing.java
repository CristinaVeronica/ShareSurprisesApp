package giveSurprises;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {
    public GiveSurpriseAndSing(String type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    public void giveWithPassion(){
        give();
        System.out.println("[GIVE_SURPRISE_AND_SING.GIVE_WITH_PASSION]: Singing a nice song, full of joy and " +
                "genuine excitement…");
    }
}
