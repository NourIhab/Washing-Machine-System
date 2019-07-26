
package model;

import esper.Configure;
import events.DischargingWater;


public class Drum extends Thread {
    private int rotatingSpeed; 
    private String drumStatus;
    private WashingMachine wash;

    
    public Drum(WashingMachine wash) {
        this.rotatingSpeed = 0;
        this.drumStatus = "idle";
        this.wash = wash;
    }

    public int getRotatingSpeed() {
        return rotatingSpeed;
    }

    public void setRotatingSpeed(int rotatingSpeed) {
        this.rotatingSpeed = rotatingSpeed;
    }

    public String getDrumStatus() {
        return drumStatus;
    }

    public void setDrumStatus(String drumStatus) {
        this.drumStatus = drumStatus;
    }
    
    public void drumRotation(int speed) throws InterruptedException
    {
        if(speed==150)
        {
            drumStatus=" washing ";
        
        }
        else if(speed==250)
        {
            drumStatus=" rinsing ";
        }
        else if(speed==500)
        {
            drumStatus=" drying ";
        }
        for(int i=0;i<speed;i++)
        {
            if(i%10==0)
            {
            Thread.sleep(500);
            System.out.println("Drum is "+ drumStatus+" clothes in the" + i +"rotation");
            }
        }
        if(wash.isHeatSignal()==false&&(drumStatus==" washing "||drumStatus==" rinsing "))
        {
            wash.setWaterPumpRemoveSignal(true);
            System.out.println("Finished Drum"+drumStatus+"process");
            Configure.sendEvent(new DischargingWater(3));
            System.out.println("Water Dishcharge process reached");
        }
  
    }
    
}
