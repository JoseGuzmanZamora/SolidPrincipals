package dependency.inversion;

public class Training implements BaseCompetition{
    public int totalScore = 0;

    @Override
    public void addToScore() {
        this.totalScore ++;
    }

    @Override
    public void subtractFromScore() {
        this.totalScore --;
    }

    @Override
    public void calculateTotalScore() {
        System.out.println("Congratulations, your score is: " + this.totalScore);
    }
}
