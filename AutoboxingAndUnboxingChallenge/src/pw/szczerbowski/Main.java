package pw.szczerbowski;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static LinkedList<Bank> banks=new LinkedList<Bank>();
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        showInstr();
        boolean exit=false;
        do{
            int choose=scanner.nextInt();
            scanner.nextLine();
            String branchName;
            String bankName;

            switch (choose) {
                case 0:
                    exit=true;
                    break;
                case 1:
                    showInstr();
                    break;
                case 2:
                    System.out.print("Enter bank name: ");
                    bankName=scanner.nextLine();
                    addBank(bankName);
                    break;
                case 3:
                    System.out.print("Enter bank name: ");
                    bankName=scanner.nextLine();
                    System.out.print("Enter branch name: ");
                    branchName=scanner.nextLine();
                    addBranchToBank(bankName, branchName);
                    break;
                case 4:
                    System.out.print("Enter branch name ");
                    branchName=scanner.nextLine();
                    System.out.print("Enter bank name: ");
                    bankName=scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String customerName=scanner.nextLine();
                    System.out.print("Enter quantity of transactions: ");
                    int transactions=scanner.nextInt();
                    scanner.nextLine();
                    addCustomerToBranch(bankName ,branchName, customerName, transactions);
                    break;
                case 5:
                    listBanks();
                    break;
                case 6:
                    bankName=scanner.nextLine();
                    listBranchesInBank(bankName);
                    break;
                case 7:
                    bankName=scanner.nextLine();
                    branchName=scanner.nextLine();
                    listCustomersInBanksBranch(bankName, branchName);
                default:
                    showInstr();
                    break;
            }


        }while (!exit);
    }

    private static void showInstr() {
        System.out.println("1-Print this");
        System.out.println("2-Add bank (name)");
        System.out.println("3-Add branch to explicit bank (bank name, branch name)");
        System.out.println("4-Add customer to explicit bank branch (bank branch name, customer name, customer transactions)");
        System.out.println("5-List banks");
        System.out.println("6-List branches in explicit bank (bank name)");
        System.out.println("7-List customers in explicit bank branch (bank name, branch name)");
        System.out.println("0-exit");
    }

    private static void addBank(String name) {
        banks.add(new Bank(name));
        System.out.println("Bank " + name + " added.");
    }

    private static void addBranchToBank(String bankName, String branchName) {
        Bank bank=getExplicitBank(bankName);
        if(bank != null) {
            bank.addBranch(new Branch(branchName));
            System.out.println("Branch " + branchName + " added to bank " + bankName);
        }
        else System.out.print("Error: There is no bank with name " + bankName);
    }

    private static void addCustomerToBranch(String bankName, String branchName, String customerName, int transactions) {
        Bank bank=getExplicitBank(bankName);
        if(bank!=null) {
            Branch branch=getExplicitBranch(bank, branchName);
            if(branch!=null) {
                branch.addCustomer(new Customer(customerName), transactions);
                System.out.println("Customer " + customerName + " added with " + transactions + " transactons.");
            }
            else System.out.println("Error: There is no branch with name " + branchName);
        }
        else System.out.println("Error: There is no bank with name " + branchName);
    }

    private static void listBanks() {
        for(int i=0; i<banks.size(); ++i)
            System.out.println(banks.get(i).getBankName());
    }

    private static void listBranchesInBank(String bankName) {
        Bank bank=getExplicitBank(bankName);
        for (int i=0; i<bank.getBranches().size(); ++i)
            System.out.println(bank.getBranches().get(i).getBranchName());
    }

    private static void listCustomersInBanksBranch(String bankName, String branchName) {
        Bank bank=getExplicitBank(bankName);
        if(bank!=null) {
            Branch branch=getExplicitBranch(bank, branchName);
            if(branch!=null) {
                for(int i=0; i<branch.getSizeOfCustomers(); ++i) {
                    System.out.println("Customer #" + i + ": " + branch.getNameOfCustomer(i));
                }
            }
            else System.out.println("There is no branch with name " + branchName);
        }
        else System.out.println("There is no bank with name " + bankName);
    }

    private static Bank getExplicitBank(String bankName) {
        for (int i=0; i<banks.size(); ++i)
            if(banks.get(i).getBankName().equals(bankName))
                return banks.get(i);

        return null;
    }

    private static Branch getExplicitBranch(Bank bank, String branchName) {
        for(int i=0; i<bank.getBranches().size(); ++i){
            if(bank.getBranches().get(i).equals(branchName)){
                return bank.getBranches().get(i);
            }
        }

        return null;
    }

}
