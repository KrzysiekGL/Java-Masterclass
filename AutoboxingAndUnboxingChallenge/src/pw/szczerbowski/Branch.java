package pw.szczerbowski;

import java.util.ArrayList;

public class Branch {
    String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName=branchName;
        customers=new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer, int initialTransactions) {
        customers.add(customer);
    }

    public void addTransaction(int customerNumber, Double balance) {
        customers.get(customerNumber).addTransaction(balance);
    }

    public int getSizeOfCustomers() {
        return customers.size();
    }

    public String getNameOfCustomer(int atIndex) {
        return customers.get(atIndex).getName();
    }
}
