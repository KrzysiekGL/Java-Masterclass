package pl.krzysiekgl;

public abstract class Animal {
  private String name;
  
  public Animal(String name) {
    this.name = name;
  }
  
  //without definition hot those methods should work - abstract
  public abstract void eat();
  public abstract void breath();
  
  public String getName() {
    return name;
  }
}
