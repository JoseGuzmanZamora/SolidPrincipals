package dependency.inversion;

public class Competition {

    public int totalScore = 0;
    public boolean status = true;

    public void addToScore(){
        if(status) {
            this.totalScore ++;
        }else{
            System.out.println("Sorry, you are disqualified...");
        }
    }

    public void subtractFromScore(){
        if(this.totalScore > 0){
            this.totalScore --;
        }else{
            this.status = false;
            System.out.println("Sorry, you are disqualified...");
        }
    }

    public void calculateTotalScore(){
        if(status){
            System.out.println("Congratulations, your score is: " + this.totalScore);
        }else{
            System.out.println("Sorry, you are disqualified...");
        }
    }
}
