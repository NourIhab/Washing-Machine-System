
package model;


public class ValveController extends Thread{
     private WashingMachine wash; 

    public ValveController(WashingMachine wash) {
        this.wash = wash;
    }
    
    
    public  void sendOpenValveSignal(boolean openSignal){
        boolean valveStatus=wash.getEntranceValveStatus();
        if(valveStatus== false & openSignal==true)
        {
            wash.getGui().getMachineStatus().setText(" Valve is now opened!");
            System.out.println("The valve is opened"); 
            wash.setEntranceValveStatus(true);
        }
        
    }

    public void sendCloseValveSignal(boolean closeSignal) {
        boolean valveStatus=wash.getEntranceValveStatus(); 
        if(valveStatus=true&&closeSignal==true)
        {
           wash.getGui().getMachineStatus().setText("Valve is now closed!");
           System.out.println("The valve is closed");
           wash.setEntranceValveStatus(false);
           
        }
        
    }
    
    
    public void sendOpenExitValveSignal(boolean opensignal)
    {
        boolean exitValveStatus=wash.getExitValveStatus();
        if(exitValveStatus==false&&opensignal==true)
        {
            wash.getGui().getMachineStatus().setText(" Valve is now opened!");
            System.out.println("The valve is opened"); 
            wash.setExitValveStatus(true);
        
        }
       
    }
    
    public void sendCloseExitValveSignal(boolean closesignal)
    {
        boolean exitValveStatus=wash.getExitValveStatus();
        if(exitValveStatus==true&&closesignal==true)
        {
           wash.getGui().getMachineStatus().setText("Valve is now closed!");
           System.out.println("The  valve is closed");
           wash.setExitValveStatus(false);
        
        }
          
    }


}