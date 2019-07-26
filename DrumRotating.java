
package events;


public class DrumRotating {
    private final boolean rotate;
    private final int rotatingSpeed;

    public DrumRotating(boolean rotate, int rotatingSpeed) {
        this.rotate = rotate;
        this.rotatingSpeed = rotatingSpeed;
    }

    public boolean isRotate() {
        return rotate;
    }

    public int getRotatingSpeed() {
        return rotatingSpeed;
    }
}
