
public class Animal {
    
    // properties/attributes
    int numberOfLegs;
    boolean isTailAvailable;
    int weight;
    String color;
    String teratory;
    String type;
    String sound;
    boolean isAwake;
    int speed;
    boolean isHungry;
    boolean isGroupAnimal;
    boolean isAlive;
    boolean isClean;

    // Behaviours
    public String speak() {
        return sound;
    }

    public void walk() {
        speed = 10;
    }

    public void sleep() {
        isAwake = false;
    }

    public void eat(String food) {
        // method of digesting
        isHungry = false;
    }

    public void hunt() {
        isAlive = false;
    }

    public void bath() {
        isClean = true;
    }

}
