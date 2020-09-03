package open.close;

import java.util.Dictionary;

public class BettlerAlternativeAthlete {
    public String name;
    public Dictionary<String, Integer> availableLiquids;

    public BettlerAlternativeAthlete(Dictionary<String, Integer> liquids){
        this.availableLiquids = liquids;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void drink(String liquidName, int amount){
        Integer value = this.availableLiquids.get(liquidName);
        if(value != null){
            for(int i = 0; i < amount ; i++){
                if(value > 0){
                    String message = String.format("Drank one liter of %s",liquidName);
                    System.out.println(message);
                    value --;
                    this.availableLiquids.put(liquidName, value);
                }else{
                    System.out.println("Oops, out of" + liquidName);
                    break;
                }
            }
        }
    }
}
