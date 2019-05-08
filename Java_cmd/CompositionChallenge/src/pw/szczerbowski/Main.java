package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        Room theRoom=new Room(new Lamp(1200, "Yellow"),
                                new Bed(new Dimensions(230, 70, 120), false),
                                new Door(new Dimensions(80, 200, 15), "Brown"));

        theRoom.makeTheBed();
        theRoom.litTheLamp();

        theRoom.makeTheBed();

        System.out.println("Dimensions of bed are: " + theRoom.getBed().getDimensions().getWidth() + " x "
                                                    + theRoom.getBed().getDimensions().getHeight() + " x "
                                                    + theRoom.getBed().getDimensions().getDepth());
    }
}
