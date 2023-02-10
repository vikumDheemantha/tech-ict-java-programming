public class Biycle {

    // properties
    public int speed = 0;
    public int gear = 0;
    public String brand;
    public String color;

    // behaviours
    public void run(int initiateSpeed) {
        speed = initiateSpeed;
    }

    public void stop() {
        speed = 0;
    }

    public void increaseSpeed(int increment) {
        speed = speed + increment;
    }

    public void applyBreak() {
        speed = speed - 20;
    }

    public void paintJob(String c) {
        color = c;
    }

    public int readSpeed() {
        return speed;
    }
}
