
package components.comp3_objects.project.sp17;

// Created by John in Java Spring 2017, CCAC
class Scoreboard {
        
    public String team;
    public String team2;
    private int score;
    public int score2;
    public int timeLeft;
    private int currentQuarter;
    private final int TOTAL_TIME= 40;
    
    
    Scoreboard(String homeName, String awayName, int pointScored, int pointScored2){
    team = homeName;
    team2= awayName;
    score= pointScored;
    score2= pointScored2;
    timeLeft = TOTAL_TIME;
    currentQuarter = 1;
    }//close costructor
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int newScore){
        score = newScore;
    }
    
    public int getQuarter(){
        return currentQuarter;
    }
    
    public void setQuarter(int newQuarter){
        currentQuarter = newQuarter;
    }
// close scoreboard
        public String getInfo() {
        String scoreInfo;
        scoreInfo = "Team Name: " + team + "      Team Name: " + team2 +
                "\n    Score: " + score + "             Score: " + score2 +
                "\n              Time: " + timeLeft+
                "\n           Quarter: " + currentQuarter ;
        
        return scoreInfo;
    }
}        
public class ScoreBoardLand{        
    public static void main(String[] args){
       
       Scoreboard scoreFinal = new Scoreboard("Home", "Away", 0, 0); 
               
       String message;
       message = scoreFinal.getInfo();
       System.out.println(message);

    }

}