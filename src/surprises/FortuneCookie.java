package surprises;

import helpers.Utils;

public class FortuneCookie implements ISurprise {
    private String message;

    private static String [] quotes = new String [] {
            "If you don’t go after what you want, you’ll never have it. If you don’t ask, the answer is always no." +
                    " If you don’t step forward, you’re always in the same place. -Nora Roberts",
            "A life spent making mistakes is not only more honorable, but more useful than a life spent doing" +
                    " nothing. -George Bernard Shaw",
            "Nobody can make you feel inferior without your consent. -Eleanor Roosevelt",
            "Nothing splendid has ever been achieved except by those who dared believe that something inside" +
                    " of them was superior to circumstance. -Bruce Barton",
            "Just decide; what's it's gonna be, who you're gonna be and how your gonna do it, and then from that" +
                    " point, the universe will get out of your way. -Will Smith",
            "Don’t spend time beating on a wall, hoping to transform it into a door. — Coco Chanel",
            "Always keep your eyes open. Keep watching. Because whatever you see can inspire you. — Grace Coddington",
            "Champions keep playing until they get it right. — Billie Jean King",
            "Genius is 1% inspiration, 99% perspiration. — Thomas Edison",
            "You must be the change you wish to see in the world. — Mahatma Gandhi",
            "Do it with passion, or not at all. — Rosa Nouchette Carey",
            "If you want to live a happy life, tie it to a goal, not to people or objects. — Albert Einstein ",
            "Never give up on a dream just because of the time it will take to accomplish it. The time will" +
                    " pass anyway.” — Earl Nightingale",
            "If it scares you, it might be a good thing to try. — Seth Godin",
            "Sometimes you win, sometimes you learn. — John Maxwell",
            "The greatest glory in living lies not in never falling, but in rising every time we fall. -Nelson Mandela",
            "The way to get started is to quit talking and begin doing. -Walt Disney",
            "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's" +
                    " success. -James Cameron",
            "Always remember that you are absolutely unique. Just like everyone else. -Margaret Mead",
            "Tell me and I forget. Teach me and I remember. Involve me and I learn. -Benjamin Franklin"
    };


    public FortuneCookie(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void enjoy() {
        System.out.println(this.message);
    }

    public static FortuneCookie generate() {
        int position = Utils.generateRandomNumber(quotes.length);
        String message = quotes[position];
        System.out.println("Congrats! You've received a fortune cookie with following message:" + message);

        return new FortuneCookie(message);
    }

    @Override
    public String toString() {
        return "Your fortune cookie is: " + this.getMessage();
    }
}
