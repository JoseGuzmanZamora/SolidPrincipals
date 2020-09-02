package single.responsibility;

import java.util.List;

public class Athlete {
    public String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void drinkWater(int amount){
        for(int i = 0; i < amount; i++) {
            System.out.println("Drank one liter of water");
        }
    }
}
