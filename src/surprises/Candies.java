package surprises;

import helpers.Utils;

public class Candies implements ISurprise {
    private int numberOfCandies;
    private String type;

    private static String [] typesOfCandies = new String [] {"chocolate", "jelly", "fruits", "vanilla", "milk",
            "bubble gum", "mints", "rocky candy", "gummy", "cheese", "strawberry", "bubble", "peanuts",
            "fizzies", "atomic fireball", "cinnamon", "dots", "fruits", "M&Ms", "ring pop" };

    public Candies(int numberOfCandies, String type) {
        this.numberOfCandies = numberOfCandies;
        this.type = type;
    }

    public int getNumberOfCandies() {
        return numberOfCandies;
    }

    public void setNumberOfCandies(int numberOfCandies) {
        this.numberOfCandies = numberOfCandies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void enjoy() {
        System.out.println("Congrats! You received " + this.getNumberOfCandies() + " " +  this.getType() + " candies!");
    }

    public static Candies generate() {
        int candyTypePosition = Utils.generateRandomNumber(typesOfCandies.length - 1);
        int numberOfCandies = Utils.generateRandomNumber(50);
        String type = typesOfCandies[candyTypePosition];
        System.out.println("You've received " + numberOfCandies + " " + type + " candies");

        return new Candies(numberOfCandies, type);
    }

    @Override
    public String toString() {
        return "You've received " + this.getNumberOfCandies() + " " + this.getType() + " candies";
    }
}
