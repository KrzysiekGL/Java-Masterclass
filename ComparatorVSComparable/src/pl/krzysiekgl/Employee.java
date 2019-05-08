package pl.krzysiekgl;

public class Employee implements Comparable<Employee> {
    private int empID;
    private String name;
    private int age;
    
    /**
     * Compare a given Employee with this object.
     * If employee id of this object is
     * greater than the received object,
     * then this object is greater than the other.
     */
    @Override
    public int compareTo(Employee o) {
        return this.empID - o.empID;
    }
    
    public Employee(int empID, String name, int age) {
        this.empID = empID;
        this.name = name;
        this.age = age;
    }
    
    public int getEmpID() {
        return empID;
    }
    
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
