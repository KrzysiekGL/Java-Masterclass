package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        Case theCase=new Case("Razer Case", "NZXT", "Corsair", new Dimensions(70, 100, 35));
        Monitor monitor=new Monitor("WS27XFHD", "BENQ", 27, new Resolution(1920, 1080));
        Motherboard motherboard=new Motherboard("GA-370X-Q9", "SuperMicro", 8, 8, "SM_7.12.192");

        PC myPC=new PC(theCase, monitor, motherboard);

        myPC.powerUp();
    }
}
