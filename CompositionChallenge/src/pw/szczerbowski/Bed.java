package pw.szczerbowski;

public class Bed {
    private Dimensions dimensions;
    private boolean isMade;

    public Bed(Dimensions dimensions, boolean isMade) {
        this.dimensions = dimensions;
        this.isMade = isMade;
    }

    public void makeTheBed(){
        if(isMade) System.out.println("Bed is already made");
        else {
            System.out.println("Making bed");
            isMade=!isMade;
        }
    }

    public Dimensions getDimensions(){
        return dimensions;
    }
}
