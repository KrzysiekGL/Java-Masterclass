package pw.szczerbowski;

public class LandRover extends Car {
    private int speed;

    public LandRover(int changingGears, int speed){
        super(1, changingGears);
        this.speed=speed;
    }

    @Override
    public void move(int velocity, int direction) {
        super.move(velocity, direction);
        System.out.println("Car is a Land Rover");
    }
}
