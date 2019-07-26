/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Level;
import java.util.logging.Logger;


public class HeatComponent extends Thread {

    private final WashingMachine wash;
    boolean heatSignal = false;
   

    public HeatComponent(WashingMachine wash) {
        this.wash = wash;
    }

    public void setHeatSignal(boolean heatSignal) {
        this.heatSignal = heatSignal;
    }

    public boolean isHeatSignal() {
        return heatSignal;
    }
  
    
    
    
    @Override
    public void run() {
        while (true) {
            
            if (wash.isMachineOn()&&wash.getHeatSensed()!= wash.getRequestedTemp()&&heatSignal==true&&wash.getEntranceValveStatus()==false){
                
                wash.getHeatSensor().raiseTemp();
            }
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HeatComponent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
