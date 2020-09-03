package single.responsibility;

import ChinoGuzman.Athlete;

public class Trainer extends Athlete {

    public void setupTraining(String name){
        System.out.println("Setting up training for " + name + ":");
        System.out.println("Done.");
    }

    public void supportAthlete(String name){
        String message = String.format("Trainer %s says: \n You can do it %s, push yourself!",this.name, name);
        System.out.println(message);
    }

    public void giveWater(Athlete thirstyAthlete){
        if(availableWater > 0){
            thirstyAthlete.availableWater ++;
            this.availableWater --;
        }else{
            String error = String.format("Trainer %s has no water left.");
            System.out.println(error);
        }
    }
}
