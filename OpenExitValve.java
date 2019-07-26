/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author Lenovo
 */
public class OpenExitValve {
    private boolean open;

    public OpenExitValve(boolean open) {
        this.open = open;
    }
    
    public boolean isOpen() {
        return open;
    }
    
}
