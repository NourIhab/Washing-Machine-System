
package model;


public class Motor extends Thread {
     private WashingMachine wash;

    public Motor(WashingMachine wash) {
        this.wash = wash;
    }
    
    
    public  void sendWashSignal(boolean washSignal) throws InterruptedException{
       Thread.sleep(20000);
        boolean washinProcessStatus=wash.isWashSignal();
        if(washinProcessStatus==true&&washSignal==true)
        {
            wash.sendWashSignaltoDrum(150);
            Thread.sleep(2000);
            wash.getGui().getMachineStatus().setText("Washing process will start shortly!");
            System.out.println("Washing process is occuring at the moment"); 
            
        }
        
    }
    
    public  void sendRinseSignal(boolean rinseSignal) throws InterruptedException{
         Thread.sleep(20000);
        boolean washinProcessStatus=wash.isRinseSignal();
        if(washinProcessStatus==true&&rinseSignal==true)
        {
            wash.sendRinseSignaltoDrum(250);
            Thread.sleep(2000);
            wash.getGui().getMachineStatus().setText("Rinsing process will start shortly!");
            System.out.println("Rinsing process is occuring at the moment");    
            
        }
        
    }
    
    
    public  void sendDrySignal(boolean drySignal) throws InterruptedException{
         Thread.sleep(20000);
        boolean washinProcessStatus=wash.isDrySignal();
        if(washinProcessStatus==true&&drySignal==true)
        {
            wash.sendDrySignaltoDrum(500);
            Thread.sleep(2000);
            wash.getGui().getMachineStatus().setText("Drying process will start shortly!");
            System.out.println("Drying process is occuring at the moment"); 
            
        }
        
        
    }
     
     
     
     
    
}
