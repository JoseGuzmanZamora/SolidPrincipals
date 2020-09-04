package open.close;

public class Athlete2 {
    public String name;
    public int availableWater = 10;
    public int availableGatorade = 5;
    public int availableCoke = 1;

    public void drinkWater(int amount){
        for(int i = 0; i < amount; i++) {
            if(this.availableWater == 0){
                System.out.println("Opps, no water left");
                break;
            }else {
                System.out.println("Drank one liter of water");
                availableWater --;
            }
        }
    }
    public void drinkGatorade(int amount){
        for(int i = 0; i < amount; i++) {
            if(this.availableGatorade == 0){
                System.out.println("Opps, no Gatorade left");
                break;
            }else {
                System.out.println("Drank one liter of Gatorade");
                availableGatorade --;
            }
        }
    }
    public void drinkCoke(int amount){
        for(int i = 0; i < amount; i++) {
            if(this.availableCoke == 0){
                System.out.println("Opps, no coke left");
                break;
            }else {
                System.out.println("Drank one liter of coke");
                availableCoke --;
            }
        }
    }
}
