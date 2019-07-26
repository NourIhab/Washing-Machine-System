
package events;

public class DoorSensorReading {
    private final String doorState;

    public DoorSensorReading(String State) {
        this.doorState = State;
    }

    public String getState() {
        return doorState;
    }
}
