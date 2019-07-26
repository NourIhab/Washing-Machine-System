
package events;

public class HeatSensorReading {
    
    private final int temp;
    
    public HeatSensorReading(int temp)
    {
        this.temp = temp;
    }
    
    public int getTemp() {
        return temp;
    }
    
}
