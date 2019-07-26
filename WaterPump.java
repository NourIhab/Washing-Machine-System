package model;

import esper.Configure;
import events.AddingWater;
import java.util.logging.Level;
import java.util.logging.Logger;
public class WaterPump extends Thread{
    
    private final  WashingMachine wash; 
    private boolean removeWaterSignal=false;
     
    public WaterPump(WashingMachine wash) {
        this.wash = wash;
    }

    public boolean isRemoveWaterSignal() {
        return removeWaterSignal;
    }

    public void setRemoveWaterSignal(boolean removeWaterSignal) {
        this.removeWaterSignal = removeWaterSignal;
    }
    

    @Override
    public void run() {
        while (true) 
        {
            if (wash.isMachineOn()&&wash.getWaterLevelSensed()!=wash.getRequestedWaterAdded()&&wash.getEntranceValveStatus()==true){
                
                wash.getWaterLevelSensor().addWater();
            }
            else if(wash.isMachineOn()&&wash.getWaterLevelSensed()>wash.getRequestedWaterRemoved()&&wash.getExitValveStatus()==true&&wash.getEntranceValveStatus()==false)
            {
                wash.getWaterLevelSensor().removeWater();
            }
            try
            {
                this.sleep(1000);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(HeatComponent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

