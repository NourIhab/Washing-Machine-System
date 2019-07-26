
package model;

import esper.Configure;
import events.AddingWater;
import events.WaterLevelReading;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WaterLevelSensor extends Thread{
    private WashingMachine wash;
    private int waterlevel;

    public WaterLevelSensor(WashingMachine wash) {
        this.wash = wash;  
        this.waterlevel = 0;
    }

 
    public int getWaterlevel() {
        return waterlevel;
    }
    
    public void addWater() {
        waterlevel +=1;
    }
    
    public void removeWater(){
        waterlevel -=1;
    }
    
    
    
    
    @Override
    public void run() {
        while (true) {
           
            if(wash.isMachineOn()&&(wash.getEntranceValveStatus()==true)||wash.getExitValveStatus()==true)
            {  
                try 
                {
                    this.sleep(1000);
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HeatSensor.class.getName()).log(Level.SEVERE, null, ex);
                }
                Configure.sendEvent(new WaterLevelReading(waterlevel));
            }
        }
    }
    }

