
package model;


public class WaterEntranceValve {
    private boolean valveStatus;

    public WaterEntranceValve() {
        this.valveStatus = false;
    }

    public WaterEntranceValve(boolean valveStatus) {
        this.valveStatus = valveStatus;
    }

    public boolean isValveStatus() {
        return valveStatus;
    }

    public void setValveStatus(boolean valveStatus) {
        this.valveStatus = valveStatus;
    }

    
    
    
}
