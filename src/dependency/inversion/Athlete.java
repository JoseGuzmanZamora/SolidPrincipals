package dependency.inversion;

public class Athlete {
    public String name;
    public int availableWater = 10;

    // Ready to compete
    public void compete(){
        Competition comp = new Competition();

        for(int i = 0 ; i < 5; i ++){
            comp.addToScore();
        }
        comp.calculateTotalScore();

        // Different Calls
        BetterCompetition competition = new BetterCompetition();
        //Training competition = new Training();

        competition.addToScore();
        competition.subtractFromScore();
        competition.calculateTotalScore();
    }
}
