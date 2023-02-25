package base;

import base.TaskManager;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class VirtualPet {

    private String name;
    private int happiness;
    private String speak;
    private TaskManager TM;

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
        Random r = new Random();
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
                    "“The secret of getting ahead is getting started.” —Mark Twain");
            this.speak = P0.get(r.nextInt(P0.size()));
        } else if (percentage <= 20) {
            Collections.addAll(P20, "Keep up the good work!", "Let’s get halfway there!",
                    "“The best time to plant a tree was 20 years ago. The second best time is now.” ―Chinese Proverb",
                    "One day or day one. You decide.");
            this.speak = P20.get(r.nextInt(P20.size()));
        } else if (percentage <= 40) {
            Collections.addAll(P40, "You are doing incredible work!", "Getting closer to the goal!",
                    "“Magic is believing in yourself. If you can make that happen, you can make anything happen.” —Johann Wolfgang Von Goethe");
            this.speak = P40.get(r.nextInt(P40.size()));
        } else if (percentage <= 47) {
            Collections.addAll(P47, "You got this!", "Keep going!",
                    "“Write it. Shoot it. Publish it. Crochet it. Sauté it. Whatever. MAKE.” —Joss Whedon",
                    "Smile, you are amazing :)");
            this.speak = P47.get(r.nextInt(P47.size()));
        } else if (percentage <= 49){
            Collections.addAll(P49, "Almost half way there!", "“Impossible is just an opinion.” —Paulo Coelho",
                    "“We are what we repeatedly do. Excellence, then, is not an act, but a habit.” ―Aristotle");
            this.speak = P49.get(r.nextInt(P49.size()));
        } else if (percentage <= 60) {
            Collections.addAll(P60, "A smart person once told me reward yourself with a sweet.",
                    "“Be a postage stamp, stick to a thing till you get there.” - Josh Billings",
                    "As motivation, think about the nap that comes after the work.");
            this.speak = P60.get(r.nextInt(P60.size()));
        } else if (percentage <= 80) {
            Collections.addAll(P80, "I'm proud of you. You're going somewhere.", "Hold the vision, trust the process.",
                    "You can do anything if you just believe in yourself.");
            this.speak = P80.get(r.nextInt(P80.size()));
        } else if (percentage <= 99) {
            Collections.addAll(P99, "Sooooo close!", "“Whatever you are, be a good one.” ―Abraham Lincoln",
                    "“Do what you can, with what you have, where you are.” ―Theodore Roosevelt");
            this.speak = P99.get(r.nextInt(P99.size()));
        } else if (percentage == 100) {
            Collections.addAll(P100, "You did it!!!", "Everything is completed!",
                    "“All our dreams can come true, if we have the courage to pursue them.” —Walt Disney");
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
