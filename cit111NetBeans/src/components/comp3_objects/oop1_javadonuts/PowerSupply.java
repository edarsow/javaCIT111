
package components.comp3_objects.oop1_javadonuts;

/**
 * Simulates the behavior of a variable DC power supply
 * @author Technology Rediscovery
 */
public class PowerSupply {
    
    // current in millivolts
    final double MAX_CURRENT = 2000.0;
    // voltage in VDC
    final double MAX_VOLTAGE = 12.0;
    
    // member variables
    public boolean isOn;
    private double currentDraw;
    private double currentVoltage;
    private boolean isOverheating;

    /**
     * Method for adding current load to the power supply
     * @param currentGain the amount of new current draw
     * @return the current overall current draw
     */
    public double drawMoreCurrent(double currentGain){
        // write my guts
    }
    
    /**
     * Method for reducing current load on the power supply
     * @param currentLoss the amount of current reduction
     * @return the current current draw
     */
    public double dropCurrent(double currentLoss){
        // write my guts
    }
    
    /**
     * Accessor method for setting output voltage
     * @param volts volts to set the supply's output
     */
    public void setCurrentVoltage(double volts){
        // write my guts
    }
    
    /**
     * Checking if the power supply is overheating
     * @return true = overheating, false = not overheating
     */
    public boolean getTempStatus(){
        // write my guts
    }
    
    
    
    
    
    
    
    
    
}
