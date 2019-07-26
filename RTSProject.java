
package esper;

import model.Door;
import model.WashingMachine;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class RTSProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Disable logging
        Logger.getRootLogger().setLevel(Level.OFF);

        // Register all events
        Configure.registerEvents();

        // Create WashingMachine
        final WashingMachine washingMachine = new WashingMachine();

            Configure.createStatement("Select state from PowerEvent")
                .setSubscriber(new Object() {
                    public void update(boolean state) {
                        washingMachine.setState(state);
                    }
                });
            Configure.createStatement("Select lock from DoorLocking")
                .setSubscriber(new Object() {
                    public void update(boolean lock) {
                        
                    washingMachine.setLockDoor(lock);
                    }
                });
      
            Configure.createStatement("Select unlocked from DoorUnlocking")
                .setSubscriber(new Object() {
                    public void update(boolean unlocked) {          
                    washingMachine.setUnlockDoor(unlocked);
                    }
                });
            
            
            Configure.createStatement("Select programSelected from PressStart")
                 .setSubscriber(new Object() {
                   public void update(int programSelected) throws InterruptedException {          
                   washingMachine.washingMachineProcess(programSelected);
                   }
                });
            
            
            Configure.createStatement("Select open from OpenEntranceValve")
                 .setSubscriber(new Object() {
                   public void update(boolean opened) {          
                   washingMachine.openEntranceValveSignal();
                   }
                });
            
            
            Configure.createStatement("Select close from CloseEntranceValve")
                 .setSubscriber(new Object() {
                   public void update(boolean closed) {          
                   washingMachine.closeEntranceValveSignal();
                   }
                });
            
            
            Configure.createStatement("Select open from OpenExitValve")
                 .setSubscriber(new Object() {
                   public void update(boolean open) {          
                   washingMachine.openExitValveSignal();
                   }
                });
            
          
            Configure.createStatement("Select close from CloseExitValve")
                 .setSubscriber(new Object() {
                   public void update(boolean closed) {          
                   washingMachine.closeExitValveSignal();
                   }
                });
            
            
            Configure.createStatement("Select waterLitres from AddingWater")
                 .setSubscriber(new Object() {
                   public void update(int waterLitres) {          
                   washingMachine.sendAddWaterLevelSignal(waterLitres);
                   }
                });
            
            
            Configure.createStatement("Select waterLitres from DischargingWater")
                 .setSubscriber(new Object() {
                   public void update(int waterLitres) {          
                   washingMachine.sendRemoveWaterLevelSignal(waterLitres);
                   }
                });
            
         
            Configure.createStatement("Select waterLevel from WaterLevelReading")
                 .setSubscriber(new Object() {
                    public void update(int waterLevel) throws InterruptedException {          
                    washingMachine.setWaterLevelInGUI(waterLevel);
                    }
                });

            
            Configure.createStatement("Select temp from HeatSensorReading")
                 .setSubscriber(new Object() {
                    public void update(int temp) throws InterruptedException {          
                    washingMachine.setTempInGUI(temp);
                    }
                });
            
            
            Configure.createStatement("Select heatLevel, heatSignal from HeatingWater")
                 .setSubscriber(new Object() {
                   public void update(int heatLevel,boolean heatSignal) {          
                   washingMachine.sendHeatingSignal(heatLevel,heatSignal);
                   }
                });
            
             
            Configure.createStatement("Select rotate, rotatingSpeed from DrumRotating")
                 .setSubscriber(new Object() {
                   public void update(boolean rotate,int rotatingSpeed) throws InterruptedException {          
                   washingMachine.selectDrumProcess(rotate,rotatingSpeed);
                   }
                });
         
    }
}
