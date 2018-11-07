package pw.szczerbowski;

//for sake of course, I will put there many classes

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders){
        this.name=name;
        this.cylinders=cylinders;
        this.wheels=4;
        this.engine=true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        System.out.println("Engine is running...");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void useBreak() {
        System.out.println("Using break....");
    }
}

class Nissan extends Car {
    public Nissan(){
        super("Nissan", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine doesn't start...");
    }

    @Override
    public void accelerate() {
        System.out.println("Can not. Engine doesn't work...");
    }
}

class BMW extends Car {
    public BMW(){
        super("BMW", 99);
    }

    @Override
    public void startEngine() {
        System.out.println("Wrrruummmm!!!........");
    }

    @Override
    public void accelerate() {
        System.out.println("It is over 9000!");
    }

    @Override
    public void useBreak() {
        System.out.println("What break?...");
    }
}

class VolksWagen extends Car {
    public VolksWagen(){
        super("Golf", 3);
    }

    @Override
    public void startEngine() {
        System.out.println("This engine is running since Ice Age.");
    }

    @Override
    public void accelerate() {
        System.out.println("Wait...");
    }

    @Override
    public void useBreak() {
        System.out.println("Do you have insurance?");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car=new VolksWagen();

        System.out.println("Your car is a " + car.getName());

        car.startEngine();
        car.accelerate();
        car.useBreak();
    }
}
