
package events;


public class HeatingWater {
    private int heatLevel;
    private boolean heatSignal;

    public HeatingWater(int heatLevel, boolean heatSignal) {
        this.heatLevel = heatLevel;
        this.heatSignal = heatSignal;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public boolean isHeatSignal() {
        return heatSignal;
    }
    
}
