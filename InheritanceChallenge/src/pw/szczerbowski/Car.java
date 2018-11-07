package pw.szczerbowski;

public class Car extends Vehicle {
    private int changingGears;

    public Car(int steering, int changingGears){
        super(steering);
        this.changingGears=changingGears;
    }

    @Override
    public void move(int velocity, int direction){
        super.move(velocity, direction);
        System.out.println("Going by car");
    }
}
