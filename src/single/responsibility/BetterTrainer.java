package single.responsibility;

public class BetterTrainer extends Athlete {

    public void setupTraining(String name){
        System.out.println("Setting up training for " + name + ":");
        System.out.println("Done.");
    }

}
