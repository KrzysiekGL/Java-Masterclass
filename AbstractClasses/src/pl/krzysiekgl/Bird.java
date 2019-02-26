package pl.krzysiekgl;

public abstract class Bird extends Animal implements ICanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println("Breath in, breath out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flapping its wings");
    }
}
