package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
	    String myString="This is a string.";
	    myString+=" And \tthis \bis \nalso a st\bring...\u00A9" + 42.54f;
        System.out.println(myString);
    }
}
