package pw.szczerbowski;

public class Lamp {
    private int brightness;
    private String color;

    public Lamp(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
    }

    public void lightUp(){
        System.out.println("Lamp is lighting");
    }
}
