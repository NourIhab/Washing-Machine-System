/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Configure;
import events.HeatSensorReading;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HeatSensor extends Thread {
  
   private WashingMachine wash;
   private int temp;
   
    
     public HeatSensor(WashingMachine wash) {
        this.wash = wash;  
        this.temp=random();
    }
    
    public void raiseTemp() {
        temp +=1;
    }
    
     private int random() {
        Random r = new Random();
        return r.nextInt(11) + 10;
    }

    public int getTemp() {
        return temp;
    }
   
    
    @Override
    public void run() {
        while (true) {
              System.out.println("Heater"); 
            if(wash.isMachineOn()&&wash.isHeatSignal()==true)
            {  
                
                try 
                {
                    this.sleep(1000);
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(HeatSensor.class.getName()).log(Level.SEVERE, null, ex);
                }
                Configure.sendEvent(new HeatSensorReading(temp));
            }
        }
    }
    
}
