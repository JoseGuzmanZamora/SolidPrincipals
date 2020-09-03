package ChinoGuzman;

import open.close.BettlerAlternativeAthlete;
import single.responsibility.Trainer;

import java.util.Dictionary;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        Athlete newAthlete = new Athlete();
        newAthlete.setName("Jose");
        newAthlete.drinkWater(10);
        Trainer newTrainer = new Trainer();
        newTrainer.setName("Rodrigo");
        newTrainer.supportAthlete(newAthlete.name);
        Dictionary<String, Integer> liquids = new Hashtable<String, Integer>();
        liquids.put("Water", 10);
        liquids.put("Coke", 2);
        BettlerAlternativeAthlete test = new BettlerAlternativeAthlete(liquids);
        test.drink("Water",120);
    }
}
