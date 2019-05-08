package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal("animal", 1, 1, 5,5);

        Dog dog=new Dog("Yorkie", 8, 10, 2, 4, 1, 20, "white");
        dog.eat();
        dog.walk();
        dog.run();

        dog.whistle();

        Dog.whistle();
    }
}
