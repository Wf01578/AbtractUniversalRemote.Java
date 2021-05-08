
package oodassign7;

/**
 *
 * @author William Fletcher
 */
public class Stereo implements RemoteOperation {
    private  boolean powerState;
    
    Stereo(boolean powerState){
    this.powerState = powerState;
    }
    @Override
    public String cyclePower(){
    if(powerState = true)
        return "Powering off Stereo...";
    else 
        return "Powering On Stereo...";
    
    }
}
