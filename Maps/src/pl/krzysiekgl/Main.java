package pl.krzysiekgl;

import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public enum Weapon {
        SWORD,
        MACE
    }

    public static void main(String[] args) {
        
        //template of a Map object declaration
        //Map<K, V> dataMap = new HashMap<K, V>();
        //where K stands for Key & V stands for Value
        
//        Map<Integer, String> dataMap = new HashMap<>();
//
//        dataMap.put(0, "Zero");
//        dataMap.put(1, "One");
//        dataMap.put(2, "Two");
//        dataMap.put(3, "Three");
    
//        System.out.println(dataMap.get((int) (Math.random()*4)));
        
        
        Map<Weapon, String> myEQ = new HashMap<>();
        
        myEQ.put(Weapon.SWORD, "Great Moonlight Sword");
        myEQ.put(Weapon.MACE, "KaBOOM");
        
        //can't have two Values sharing the same Key
        //myEQ.put(Weapon.SWORD, "Katana");
        //myEQ.put(Weapon.MACE, "Just-A-Mace");
        //but there are possible workarounds like using List<> for a Value
    
        System.out.println("keySet of myEQ map is " + myEQ.keySet());
    
        for(Weapon key : myEQ.keySet()) {
            System.out.println(key + "->" + myEQ.get(key));
        }
        
        
    }
}
