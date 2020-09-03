package single.responsibility;

import ChinoGuzman.Athlete;

public class BetterTrainer extends BetterAthlete {

    public void setupTraining(String name){
        System.out.println("Setting up training for " + name + ":");
        System.out.println("Done.");
    }

}
