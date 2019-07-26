
package model;

import view.TouchScreen;


public class Door {
    
    private boolean safety;
    private WashingMachine wash; 
    
    public Door(WashingMachine wash) {
        this.wash = wash;
        this.safety=false; 
    }

  
    public boolean getSafety() {
        return safety;
    }

    public void setSafety(boolean state) {
        this.safety = state;
    }
 
    
}