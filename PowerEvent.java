
package events;

public class PowerEvent {
    
    private boolean pwrState;
    
    public PowerEvent(boolean state)
    {
        this.pwrState = state;
    }
    
    public boolean getState() {
        return pwrState;
    }
    
}
