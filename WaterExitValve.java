
package model;


public class WaterExitValve {
    private boolean valveStatus=false;

    public WaterExitValve() {
        valveStatus=false;
    }
    
    
    public WaterExitValve(boolean valveStatus) {
        this.valveStatus = valveStatus;
    }

    public boolean isValveStatus() {
        return valveStatus;
    }

    public void setValveStatus(boolean valveStatus) {
        this.valveStatus = valveStatus;
    }

    
    
    
}
