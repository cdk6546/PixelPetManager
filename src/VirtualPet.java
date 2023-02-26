
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class VirtualPet {

    private String name;
    private int happiness;
    private String speak;
    private TaskManager TM;
    private Random r;

    public VirtualPet(String name, TaskManager TM) {
        this.name = name;
        this.TM = TM;
        updateHappiness();
        setSaying(TM);

    }

    public String getName() {
        return name;
    }

    public void updateHappiness() {
        this.happiness = TM.getPercentage();
    }

    public void setSaying(TaskManager TM) {
        int percentage = TM.getPercentage();
        r = new Random();
        ArrayList<String> P0 = new ArrayList<>();
        ArrayList<String> P20 = new ArrayList<>();
        ArrayList<String> P40 = new ArrayList<>();
        ArrayList<String> P47 = new ArrayList<>();
        ArrayList<String> P49 = new ArrayList<>();
        ArrayList<String> P60 = new ArrayList<>();
        ArrayList<String> P80 = new ArrayList<>();
        ArrayList<String> P99 = new ArrayList<>();
        ArrayList<String> P100 = new ArrayList<>();


        if (percentage <= 0) {
            Collections.addAll(P0, "Lets complete some tasks!", "Time to work!",
                    "“The secret of getting ahead is getting started.” —Mark Twain", "I believe in you, you're strong.",
                    "The only way to reach the end is to begin.",
                    "Try not to feel pressured by the tasks ahead. Focus on them one at a time.",
                    "We are our choices, build a great story.", "Lets start! ٩( ^ᴗ^ )۶");
            this.speak = P0.get(r.nextInt(P0.size()));
        } else if (percentage <= 20) {
            Collections.addAll(P20, "Keep up the good work!", "Let’s get halfway there!",
                    "“The best time to plant a tree was 20 years ago. The second best time is now.” ―Chinese Proverb",
                    "One day or day one. You decide.",
                    "Even though I can't give real hugs, consider this a virtual one: (っ◕‿◕)っ",
                    "Don't worry about failure, you only have to be right once.",
                    "The level of success is connected with the level of action.",
                    "“It's okay to look at the past and future, just don't stare.” ―Benjamin Dover");
            this.speak = P20.get(r.nextInt(P20.size()));
        } else if (percentage <= 40) {
            Collections.addAll(P40, "You are doing incredible work!", "Getting closer to the goal!",
                    "“Magic is believing in yourself. If you can make that happen, you can make anything happen.” " +
                            "—Johann Wolfgang Von Goethe", "Making progress!", "Take a deep breath.",
                    "“Magic is believing in yourself. If you can make that happen, you can make anything happen.” ",
                    "Take the tasks one at a time.",
                    "“Great things are done by a series of small things brought together. —Vincent Van Gogh");
            this.speak = P40.get(r.nextInt(P40.size()));
        } else if (percentage <= 47) {
            Collections.addAll(P47, "You got this!", "Keep going up the amazing work!",
                    "“Write it. Shoot it. Publish it. Crochet it. Sauté it. Whatever. MAKE.” —Joss Whedon",
                    "Smile, you are amazing :)", "Any progress is meaningful, no matter the size",
                    "Every time you do a project, you are learning something new.",
                    "Look, if cauliflower can become pizza, you my friend, can do anything.",
                    "“We are what we repeatedly do. Excellence, then, is not an act, but a habit.” ―Aristotle");
            this.speak = P47.get(r.nextInt(P47.size()));
        } else if (percentage <= 49){
            Collections.addAll(P49, "Almost half way there!", "“Impossible is just an opinion.” —Paulo Coelho",
                    "The light at the end of the tunnel is getting closer.",
                    "Your mind will answer most of the problems if you learn to relax and focus.");
            this.speak = P49.get(r.nextInt(P49.size()));
        } else if (percentage <= 60) {
            Collections.addAll(P60, "A smart person once told me reward yourself with a sweet.",
                    "“Be a postage stamp, stick to a thing till you get there.” ―Josh Billings",
                    "As motivation, think about the nap that comes after the work.",
                    "You are shining like sunshine on a cloudy day.",
                    "Its not about ideas. Its about making ideas happen.",
                    "“The elevator to success is out of order. You'll have to use the stairs, one step at a time.” ―Joe Girard",
                    "When someone says you can't do it, do it twice, and take pictures.");
            this.speak = P60.get(r.nextInt(P60.size()));
        } else if (percentage <= 80) {
            Collections.addAll(P80, "I'm proud of you. You're getting somewhere.", "Hold the vision, trust the process.",
                    "You can do anything if you just believe in yourself.",
                    "If nobody has told you yet today, you look amazing.", "All the pieces are starting to fall into place...",
                    "Never let anyone treat you like a yellow starburst. You are a pink starburst.",
                    "“You're only given a little spark of madness. You mustn't lose it.” —Robin Williams",
                    "You are making steady progress! Keep going!");
            this.speak = P80.get(r.nextInt(P80.size()));
        } else if (percentage <= 99) {
            Collections.addAll(P99, "You are so close!", "“Whatever you are, be a good one.” ―Abraham Lincoln",
                    "“Do what you can, with what you have, where you are.” ―Theodore Roosevelt",
                    "Remember it is okay to take a break once in awhile. <3",
                    "Treat yourself to a nice glass of cold water.",
                    "People who wonder whether the glass is half full or half empty are missing the point. The glass is refillable.",
                    "I am so excited for you to finish this project. You are so far in!",
                    "You are doing marvelously.");
            this.speak = P99.get(r.nextInt(P99.size()));
        } else if (percentage == 100) {
            Collections.addAll(P100, "You did it!!!", "Everything is completed!",
                    "“All our dreams can come true, if we have the courage to pursue them.” —Walt Disney",
                    "(╯°▽°╯)", "There's nothing quite like finishing a project.", "Look at you go! You did so well.",
                    "“A project is complete when it starts working for you, rather than you working for it.” —Scott Allen");
            this.speak = P100.get(r.nextInt(P100.size()));
        }
    }

    public int getHappiness() {
        return this.happiness;
    }

    public String getSaying(TaskManager TM) {
        setSaying(TM);
        return this.speak;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
