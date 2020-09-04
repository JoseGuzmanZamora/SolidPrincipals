package segregation;

public class Swimmer implements Athlete {
    @Override
    public void drinkWater(int amount) {
        for(int i = 0; i < amount; i++){
            String message = String.format("Drank %d liters of water",amount);
            System.out.println(message);
        }
    }
    @Override
    public void run(int kilometers) {
        for(int i = 0; i < kilometers; i++){
            String message = String.format("Ran %d kilometers",kilometers);
            System.out.println(message);
        }
    }

    @Override
    public void doPushUps(int amount) {
        for(int i = 0; i < amount; i++){
            String message = String.format("Did %d pushups",amount);
            System.out.println(message);
        }
    }

    @Override
    public void swim(int meters) {
        for(int i = 0; i < meters; i++){
            String message = String.format("Swam %d meters",meters);
            System.out.println(message);
        }
    }
}
