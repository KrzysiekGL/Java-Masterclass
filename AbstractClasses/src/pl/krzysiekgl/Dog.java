package pl.krzysiekgl;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }
}
