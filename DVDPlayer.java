/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodassign7;

/**
 *
 * @author William Fletcher
 */
public class DVDPlayer implements RemoteOperation{

    private  boolean powerState;
    
    DVDPlayer(boolean powerState){
    this.powerState = powerState;
    }

    @Override
    public String cyclePower(){
    if(powerState = true)
        return "Powering off DVD...";
    else 
        return "Powering On DVD...";
    
    }

    
}
