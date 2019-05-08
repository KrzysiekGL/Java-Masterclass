package pw.szczerbowski;

public class Vehicle {
    private int steering;

    public Vehicle(int steering){
        this.steering=steering;
    }

    public void move(int velocity, int direction) {
        System.out.println("Moving in direction " + direction + " with velocity equal " + velocity);
    }
}
