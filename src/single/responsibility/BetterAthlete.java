package single.responsibility;

public class BetterAthlete {
    public String name;
    public int availableWater = 10;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

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
}
