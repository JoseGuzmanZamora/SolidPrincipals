package single.responsibility;

public class Athlete {
    public String name;
    public int availableWater = 10;

    public void drinkWater(int amount){
        for(int i = 0; i < amount; i++) {
            if(this.availableWater == 0){
                System.out.println("Opps, no water left");
                break;
            }else {
                System.out.println("Drank 1 liter of water");
                availableWater --;
            }
        }
    }
}
