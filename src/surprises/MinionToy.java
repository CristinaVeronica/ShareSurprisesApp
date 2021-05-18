package surprises;

public class MinionToy implements ISurprise {
    private String name;
    private static int counter = 0;
    private static String [] minions = new String [] {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim", "Tom", "John",
                                                "David", "Brad", "Herb", "Bru", "Walter", "Scarlett", "Tina", "Sumo",
                                                "Vector", "Jokes", "Bob", "Phil", "Gru"};

    public MinionToy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void enjoy() {
        System.out.println("Surprise!! My name is " + this.getName() + " and I will be your minionToy!");
    }

    public static MinionToy generate() {
        if (counter >= minions.length-1) {
            counter = 0;
        }
        String minionName = minions[counter];
        counter++;
        System.out.println("Congrats! You've received a minion called " + minionName);
        return new MinionToy(minionName);
    }

    @Override
    public String toString() {
        return "You've received a minion toy " + this.getName()  + "!";
    }
}
