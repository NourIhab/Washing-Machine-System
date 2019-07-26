
package esper;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import events.PowerEvent;
import events.DoorSensorReading;
import events.AddingWater;
import events.CloseEntranceValve;
import events.CloseExitValve;
import events.WaterLevelReading;
import events.HeatSensorReading;
import events.HeatingWater;
import events.DrumRotating;
import events.DischargingWater;
import events.TouchScreenFlashing;
import events.DoorLocking;
import events.DoorUnlocking;
import events.OpenEntranceValve;
import events.OpenExitValve;
import events.PressStart;


public class Configure {

    private static EPServiceProvider engine = EPServiceProviderManager.getDefaultProvider();

    public static void registerEvents() {
        
        engine.getEPAdministrator().getConfiguration().addEventType(PowerEvent.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DoorSensorReading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DoorLocking.class);
        engine.getEPAdministrator().getConfiguration().addEventType(AddingWater.class);
        engine.getEPAdministrator().getConfiguration().addEventType(OpenEntranceValve.class);
        engine.getEPAdministrator().getConfiguration().addEventType(CloseEntranceValve.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PressStart.class);
        engine.getEPAdministrator().getConfiguration().addEventType(WaterLevelReading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(HeatSensorReading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(HeatingWater.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DrumRotating.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DischargingWater.class);
        engine.getEPAdministrator().getConfiguration().addEventType(OpenExitValve.class);
        engine.getEPAdministrator().getConfiguration().addEventType(CloseExitValve.class);
        engine.getEPAdministrator().getConfiguration().addEventType(TouchScreenFlashing.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DoorUnlocking.class);

        System.out.println("Events Successfully Registered.");
    }

    public static EPStatement createStatement(String s) {
        EPStatement result = engine.getEPAdministrator().createEPL(s);
        System.out.println("EPL Statement "+ s +" created successfully!");
        return result;
    }
    
    public static void sendEvent(Object o)
    {
        engine.getEPRuntime().sendEvent(o);
    }

}
