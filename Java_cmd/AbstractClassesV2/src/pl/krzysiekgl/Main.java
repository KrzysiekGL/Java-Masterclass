package pl.krzysiekgl;

public class Main {
  
  public static void main(String[] args) {
    Dog dog = new Dog("Szarik");
    dog.eat();
    dog.breath();
    
    Kanarek kanarek = new Kanarek("Kanarek");
    kanarek.eat();
    kanarek.breath();
    kanarek.fly();
    
    Penguin penguin = new Penguin("Tux");
    penguin.fly();
    penguin.eat();
    penguin.breath();
  }
}
