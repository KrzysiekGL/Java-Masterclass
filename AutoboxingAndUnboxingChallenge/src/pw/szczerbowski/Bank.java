package pw.szczerbowski;

import java.util.ArrayList;

public class Bank {
    String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName=bankName;
        branches=new ArrayList<Branch>();
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void showCustomerFromBranch(int branchIndex) {
        for(int i=0; i<branches.get(branchIndex).getSizeOfCustomers(); ++i) {
            System.out.println(branches.get(branchIndex).getNameOfCustomer(i));
        }
    }
}