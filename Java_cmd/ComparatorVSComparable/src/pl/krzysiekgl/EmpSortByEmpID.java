package pl.krzysiekgl;

import java.util.Comparator;

public class EmpSortByEmpID implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int comparision = (o1.getEmpID() - o2.getEmpID());
        if(comparision == 0) comparision = (o1.getName().compareTo(o2.getName()));
        if(comparision == 0) comparision = (o1.getAge() - o2.getAge());
        return comparision;
    }
}
