package pl.krzysiekgl;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
  private String name;
  private Integer hitPoints;
  private String weapon;
  
  public Player(String name, int hitPoints, String weapon) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.weapon = weapon;
  }
  
  public Player() {
  }
  
  @Override
  public String toString() {
    return "Player{" +
            "name='" + name + '\'' +
            ", hitPoints=" + hitPoints +
            ", weapon='" + weapon + '\'' +
            '}';
  }
  
  @Override
  public List<String> saveValues() {
    ArrayList<String> values = new ArrayList<>();
    values.add(name);
    values.add(String.valueOf(hitPoints));
    values.add(weapon);
    return values;
  }
  
  @Override
  public void loadValues(List<String> values) {
    if(!(values != null && values.size() >= 3)) return;
    
    name = values.get(0);
    hitPoints = Integer.parseInt(values.get(1));
    weapon = values.get(2);
  }
  
  
}
