package liskov.substitution;

import ChinoGuzman.Athlete;

public class Runner extends Athlete {

    @Override
    public void drinkWater(int amount) {
        for(int i = 0; i < amount; i++) {
            if(this.availableWater == 0){
                System.out.println("Opps, no water left");
                break;
            }else {
                System.out.println("Drank 2 liters of water");
                availableWater -= 2;
            }
        }
    }
}
