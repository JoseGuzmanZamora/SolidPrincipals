package dependency.inversion;

public interface BaseCompetition {
    public int totalScore = 0;
    public boolean status = true;

    public void addToScore();

    public void subtractFromScore();

    public void calculateTotalScore();
}
