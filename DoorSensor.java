
package model;


public class DoorSensor extends Thread{
    private WashingMachine wash; 
    
    public DoorSensor(WashingMachine wash) {
        this.wash = wash;
    }
   public boolean getDoorStatus()
   {
       return wash.getDoorStatus();
   }
    
}
