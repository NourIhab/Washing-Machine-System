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
public class CloseExitValve {
    private boolean close; 

    public CloseExitValve(boolean close) {
        this.close = close;
    }

    public boolean isClose() {
        return close;
    }
    
}
