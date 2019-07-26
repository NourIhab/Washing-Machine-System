package events;


public class DoorUnlocking extends Thread {
    private boolean unlocked;

    public DoorUnlocking(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public boolean isUnlocked() {
        return unlocked;
    }
    
}
