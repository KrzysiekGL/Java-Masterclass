package pw.szczerbowski;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private int balance=0;
    private String customerName;
    private String email;
    private String phoneNumber;

    //MARK: - Constructor

    public BankAccount(){
        //calling another constructor from constructor (must be first statement in constructor)
        this(1111,0,"default name", "default email", "default number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber){
        System.out.println("Constructor with parameters called");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber){
        this(99999,2, customerName, email, phoneNumber);
    }

    //MARK: - Setters

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public  void setBalance(int balance){
        this.balance=balance;
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPhoneNumber(int phoneNumber){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter country code (PL, USD):");
        String country=scanner.nextLine();
        country=country.toUpperCase();
        switch(country){
            case "PL":
                country="+48 ";
                break;
            case "USD":
                country="+1 ";
                break;
            default:
                country="";
                break;
        }
        this.phoneNumber=country+phoneNumber;
    }

    //MARK: - Getters

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    //MARK: - Methods

    public void depositFounds(int deposit){
        this.balance+=deposit;
    }

    public void withdrawFounds(int withdraw){
        if(withdraw<=this.balance) this.balance-=withdraw;
        else System.out.println("Not enough founds in account.");
    }
}
