package liskov.substitution;

public class BetterRunner extends BetterAthlete {

    public void run(int kilometers){
        String message = String.format("Ran %d kilometers!");
        System.out.println(message);
    }
}
