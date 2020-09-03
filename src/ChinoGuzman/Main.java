package ChinoGuzman;

import liskov.substitution.BetterAthlete;
import liskov.substitution.BetterRunner;
import liskov.substitution.Runner;

public class Main {

    public static void main(String[] args) {

//        Athlete newAthlete = new Athlete();
//        Runner newRunner = new Runner();
//        newAthlete.drinkWater(7);
//        newRunner.drinkWater(7);
        BetterAthlete newAthlete = new BetterAthlete();
        BetterRunner newRunner = new BetterRunner();
        newAthlete.drinkWater(5,1);
        newRunner.drinkWater(5,3);

    }
}
