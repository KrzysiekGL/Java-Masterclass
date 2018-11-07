package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        byte number = -126;

        int i = 0;
        while (true) {
            System.out.println("number = " + number++);
            if (i++ == 256) break;
        }
    }
}