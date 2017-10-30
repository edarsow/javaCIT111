package components.comp3_objects.oop3_missionControl;

/**
 * An object that models the disaster simulation rescue team
 * @author delores
 */
public class RescueTeam {
    
    private int teamSize;

    /**
     * Setter method for teamSize
     * @param size number of people in the RescueTeam team
     */
    public void setTeamSize(int size){
        teamSize = size;
    }
    
    /**
     * Accessor for teamsize
     * @return current team size
     */
    public int getTeamSize(){
        return teamSize;
    }
    
}
