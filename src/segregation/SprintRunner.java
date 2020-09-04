package segregation;

public class SprintRunner implements BetterRunner{
    @Override
    public void doPushUps(int amount) {
        for(int i = 0; i < amount; i++){
            String message = String.format("Did %d pushups",amount);
            System.out.println(message);
        }
    }

    @Override
    public void run(int kilometers) {
        for(int i = 0; i < kilometers; i++){
            String message = String.format("Ran %d kilometers, real fast.",kilometers);
            System.out.println(message);
        }
    }

    @Override
    public void drinkWater(int amount) {
        for(int i = 0; i < amount; i++){
            String message = String.format("Drank %d liters of water",amount);
            System.out.println(message);
        }
    }
}
