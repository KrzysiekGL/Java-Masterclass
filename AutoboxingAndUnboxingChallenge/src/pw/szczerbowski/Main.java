package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        Bank bank=new Bank("superBank");
        bank.addBranch(new Branch("privateClients"));
        bank.getBranches().get(0).addCustomer(new Customer("Krowa"), 10);
        bank.getBranches().get(0).addCustomer(new Customer("Kurczak"), 10);

        bank.showCustomerFromBranch(0);
    }
}
