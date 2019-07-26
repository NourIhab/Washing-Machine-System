
package model;


public class LedLight {

    private boolean state;
    private WashingMachine wash;

    public LedLight(WashingMachine wash) {
        this.state = false;
        this.wash = wash;
    }

    public void setState(boolean state) {
        this.state = state;
        if (state) {
            wash.getGui().getLedStatusTxt().setText("ON");
        } else {
            wash.getGui().getLedStatusTxt().setText("OFF");
        }

    }

}
