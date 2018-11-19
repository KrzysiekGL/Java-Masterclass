package pw.szczerbowski;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name=name;
        transactions=new ArrayList<Double>();
    }

    public void addTransaction(double balance) {
        transactions.add(balance);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }
}