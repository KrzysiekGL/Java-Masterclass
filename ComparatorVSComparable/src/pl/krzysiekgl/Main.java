package pl.krzysiekgl;

import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List coll = Util.getEmployees();
        
        Collections.sort(coll); //sort method
        printList(coll);
        
        Collections.sort(coll, new EmpSortByName());
        printList(coll);
        
        Collections.sort(coll, new EmpSortByEmpID());
        printList(coll);
    
        Collections.sort(coll, new EmpSortByAge());
        printList(coll);
    }
    
    private static void printList(List<Employee> list) {
        System.out.println("EmpID\tName\tAge");
        for(Employee e : list) System.out.println(e.getEmpID() + "\t" + e.getName() + "\t" + e.getAge());
        System.out.println("\n");
    }
}
