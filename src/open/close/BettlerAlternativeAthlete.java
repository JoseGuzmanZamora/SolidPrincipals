package open.close;

import java.util.Dictionary;

public class BettlerAlternativeAthlete extends Person {
    public String name;

    public BettlerAlternativeAthlete(Dictionary<String, Integer> liquids) {
        super(liquids);
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}
