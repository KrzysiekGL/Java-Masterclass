package pw.szczerbowski;

public class Room {
    private Lamp lamp;
    private Bed bed;
    private Door door;

    public Room(Lamp lamp, Bed bed, Door door) {
        this.lamp = lamp;
        this.bed = bed;
        this.door = door;
    }

    public void litTheLamp(){
        lamp.lightUp();
    }

    public void makeTheBed(){
        bed.makeTheBed();
    }

    public Bed getBed(){
        return bed;
    }
}
