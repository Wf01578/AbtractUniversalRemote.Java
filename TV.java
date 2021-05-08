
package oodassign7;

/**
 *
 * @author William Fletcher
 */
public class TV implements RemoteOperation {
    private  boolean powerState;
    
    TV(boolean powerState){
    this.powerState = powerState;
    }
    @Override
    public String cyclePower(){
    if(powerState = true){
        return "Powering off TV...";
        //turnOff();
    }
        
    else 
        return "Powering On TV...";
    
    }
    
    public void turnOff() {
        this.powerState = false;
    }
    public void turnOn() {
        this.powerState = true;
    }
}
