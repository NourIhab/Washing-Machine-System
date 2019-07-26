
package model;

import esper.Configure;
import events.AddingWater;
import events.CloseEntranceValve;
import events.CloseExitValve;
import events.DischargingWater;
import events.DoorLocking;
import events.DrumRotating;
import events.HeatSensorReading;
import events.HeatingWater;
import events.OpenEntranceValve;
import events.OpenExitValve;
import events.PowerEvent;
import view.TouchScreen;


public class WashingMachine {

    // The WashingMachine GUI
    private TouchScreen gui;

    // This acts as our ON/OFF switch
    private boolean state = false;
    

    // The components of our WashingMachine
    private Door door;
    private DoorSensor doorSensor;
    private HeatComponent heatComponent;
    private HeatSensor heatSensor;
    private Drum innerDrum;
    private LedLight led;
    private Motor motor;
    private WaterEntranceValve entranceValve;
    private WaterExitValve exitValve;
    private ValveController valveController;
    private WaterLevelSensor waterLevelSensor;
    private WaterPump waterPump; 
    private int requestedTemp;
    private int requestedWaterAdd;
    private int requestedWaterRemoved;
    private boolean washSignal;
    private boolean rinseSignal;
    private boolean drySignal;
    
    public WashingMachine() {
        
        gui = new TouchScreen();
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        
        
        door = new Door(this);
        doorSensor = new DoorSensor(this);
        innerDrum = new Drum(this);
        led = new LedLight(this);
        motor = new Motor(this);
        entranceValve = new WaterEntranceValve();
        exitValve= new WaterExitValve();
        valveController = new ValveController(this);
        waterLevelSensor= new WaterLevelSensor(this);
        waterPump = new WaterPump(this);
        heatComponent= new HeatComponent(this);
        heatSensor=new HeatSensor(this);
        heatSensor.start();
        heatComponent.start();
        waterLevelSensor.start();
        waterPump.start();
        
    }

    public TouchScreen getGui() {
        return gui;
    }
    
    public boolean isMachineOn() {
        return state;
    }
    
    public boolean getDoorStatus()
    {
        return door.getSafety();
    }
    
    public boolean getEntranceValveStatus() {
        return entranceValve.isValveStatus(); 
    }

    public boolean getExitValveStatus() {
        return exitValve.isValveStatus();
    }
   
    public WaterLevelSensor getWaterLevelSensor(){
        return waterLevelSensor;
    }
    
    public int getWaterLevelSensed(){
        return waterLevelSensor.getWaterlevel();
    }

    public int getRequestedWaterAdded() {
        return requestedWaterAdd;
    }

    public int getRequestedWaterRemoved() {
        return requestedWaterRemoved;
    }

    public void setWaterPumpRemoveSignal(boolean removeSignal) {
         this.waterPump.setRemoveWaterSignal(removeSignal);
    }
    
    
    public HeatSensor getHeatSensor() {
        return heatSensor;
    }
    
    public int getHeatSensed()
    {
        return heatSensor.getTemp();
    }

    public int getRequestedTemp() {
        return requestedTemp;
    }

    public HeatComponent getHeatComponent() {
        return heatComponent;
    }
    
    public boolean isHeatSignal()
    {
        return this.getHeatComponent().isHeatSignal();
    }

    public Motor getMotor() {
        return motor;
    }
    
    public boolean isWashSignal() {
        return washSignal;
    }

    public boolean isRinseSignal() {
        return rinseSignal;
    }

    public boolean isDrySignal() {
        return drySignal;
    }

    public Drum getInnerDrum() {
        return innerDrum;
    }
    
    
   
    public void setState(boolean state) {
        this.state = state;
        this.led.setState(state);
        gui.getOnBtn().setEnabled(!state);
        gui.getOffBtn().setEnabled(state);
    }
    
    public void setLockDoor(boolean lock) {
        boolean doorStatus=this.doorSensor.getDoorStatus();
        if(doorStatus==false&lock==true)
        {       
            gui.getMachineStatus().setText("Door is now Locked!");
        }   
        gui.getSafetyButton().setEnabled(!lock);
        gui.getStartBtn().setEnabled(lock);
    }  
   
    public void setUnlockDoor(boolean unlock)
    {
        boolean doorStatus=this.doorSensor.getDoorStatus();
        if(doorStatus==false&&unlock==true)
        {
            gui.getSafetyButton().setEnabled(unlock);
            gui.getStartBtn().setEnabled(!unlock);
        }
    }
    
  
    
    public void washingMachineProcess(int selected) throws InterruptedException
    {
        
        switch (selected)
        {
            case 1: 
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(30,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(0));
        
        
                Configure.sendEvent(new DrumRotating(true,500));
                Configure.sendEvent(new DoorLocking(false));
               
                
            break;
            
            case 2: 
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(40,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(0));
        
        
                Configure.sendEvent(new DrumRotating(true,500));
                Configure.sendEvent(new DoorLocking(false));
            break;
  
            case 3:  
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(50,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(0));
        
        
                Configure.sendEvent(new DrumRotating(true,500));
                Configure.sendEvent(new DoorLocking(false));
            break;
            
            case 11:
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(30,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(0));
        
        
                Configure.sendEvent(new DrumRotating(true,500));
                Configure.sendEvent(new DoorLocking(false));
            break;
            
            case 12: 
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(40,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(0));
        
        
                Configure.sendEvent(new DrumRotating(true,500));
                Configure.sendEvent(new DoorLocking(false));
            break;
  
            case 13:        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(50,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(0));
        
        
                Configure.sendEvent(new DrumRotating(true,500));
                Configure.sendEvent(new DoorLocking(false));
            break;
            
            case 111:        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(30,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(30,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(0));
        
        
                Configure.sendEvent(new DrumRotating(true,500));
                Configure.sendEvent(new DoorLocking(false));
            break;
            
            case 112:        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(40,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(40,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(0));
        
        
                Configure.sendEvent(new DrumRotating(true,500));
                Configure.sendEvent(new DoorLocking(false));
            break;
            
            case 113:     
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(50,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new HeatingWater(50,true));
                Configure.sendEvent(new DischargingWater(3));
                Configure.sendEvent(new DrumRotating(true,150));
        
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(3));
                
                Configure.sendEvent(new AddingWater(30));
                Configure.sendEvent(new DrumRotating(true,250));
                Configure.sendEvent(new DischargingWater(0));
        
        
                Configure.sendEvent(new DrumRotating(true,500));
                Configure.sendEvent(new DoorLocking(false));
            break;
 
            default:
            break;
                
        }
        
    }
    
      
    public void openEntranceValveSignal()
    {
        valveController.sendOpenValveSignal(true);
    }

    public void closeEntranceValveSignal() {
        valveController.sendCloseValveSignal(true);
    }
    
    public void openExitValveSignal()
    {
        valveController.sendOpenExitValveSignal(true);
    }
    
    public void closeExitValveSignal()
    {
        valveController.sendCloseExitValveSignal(true);
    }
    
    public void setEntranceValveStatus(boolean status) {
        entranceValve.setValveStatus(status);
    }
    
    public void setExitValveStatus(boolean status){
        exitValve.setValveStatus(status);
    }
    
    public void sendAddWaterLevelSignal(int requestedWaterLevel){
        Configure.sendEvent(new OpenEntranceValve(true));
        this.requestedWaterAdd=requestedWaterLevel;
    }
    
    public void sendRemoveWaterLevelSignal(int requestedWaterLevel){
        Configure.sendEvent(new OpenExitValve(true));
        this.requestedWaterRemoved=requestedWaterLevel;
    }
    
    public void sendHeatingSignal(int req,boolean signal)
    {
        this.heatComponent.setHeatSignal(signal);
        this.requestedTemp=req;
    }
    
    public void sendWashSignaltoDrum(int washSpeed) throws InterruptedException
    {
        this.getInnerDrum().drumRotation(washSpeed);
    }
    
    public void sendRinseSignaltoDrum(int rinseSpeed) throws InterruptedException
    {
        this.getInnerDrum().drumRotation(rinseSpeed);
    }
    
    public void sendDrySignaltoDrum(int drySpeed) throws InterruptedException
    {
        this.getInnerDrum().drumRotation(drySpeed);
    }
    
    public void selectDrumProcess(boolean process,int processSpeed) throws InterruptedException
    {
        if(process==true&&processSpeed==150)
        {
            this.washSignal(process);
        }
        else if(process==true&&processSpeed==250)
        {
            this.rinseSignal(process);
        }
        else if(process==true&&processSpeed==500)
        {
            this.drySignal(process);
        
        }
    
    }
    
    public void washSignal(boolean wash) throws InterruptedException
    {
        this.washSignal=wash;
        motor.sendWashSignal(wash);
    
    }
    
    public void rinseSignal(boolean rinse) throws InterruptedException
    {
        this.rinseSignal=rinse;
        motor.sendRinseSignal(rinse);
    
    }
    public void drySignal(boolean dry) throws InterruptedException
    {
        this.drySignal=dry;
        motor.sendDrySignal(dry);
    }
    
    public void setTempInGUI(int temp) throws InterruptedException {
        System.out.println("Temp now is:"+temp);
        Thread.sleep(1000);
        gui.getCurrentTempTxt().setText(" "+temp);
        
        if(temp==30||temp==40||temp==50)
        {
          gui.getMachineStatus().setText("Requested Temperature reached!");
        }
        
        else if (temp >= this.requestedTemp) {
            //beeper.beep();
            Configure.sendEvent(new HeatingWater(0,false));
        }
    }
    
    public void setWaterLevelInGUI(int waterlevel)throws InterruptedException{
         System.out.println("Water Level now is:"+waterlevel);
         Thread.sleep(1000);
         gui.getWaterLevelTxt().setText(" "+waterlevel);
         
         if(waterlevel==30)
         {
            gui.getMachineStatus().setText("Water Addition Level Reached");
            Thread.sleep(3000);
            Configure.sendEvent(new CloseEntranceValve(true));

         }else if(waterlevel==3&&this.getEntranceValveStatus()==false)
         {
            gui.getMachineStatus().setText("Water Draiange Level Reached");
            Thread.sleep(3000);
            Configure.sendEvent(new CloseExitValve(true));
         }
     
     }
    
     
}
