package liskov.substitution;

public class BetterAthlete{
    public String name;
    public int availableWater = 10;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void drinkWater(int amount, int interval){
        for(int i = 0; i < amount; i++) {
            if(this.availableWater < interval){
                System.out.println("Opps, no water left");
                break;
            }else {
                String message = String.format("Drank %d liter of water", interval);
                System.out.println(message);
                availableWater -= interval;
            }
        }
    }
}
