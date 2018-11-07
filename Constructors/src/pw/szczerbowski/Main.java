package pw.szczerbowski;

public class Main {

    public static void main(String[] args){
//        BankAccount myAccount=new BankAccount();
//        System.out.println(myAccount.getBalance());
//        myAccount.setPhoneNumber(123456789);
//        System.out.println(myAccount.getPhoneNumber());
//        myAccount.depositFounds(10000);
//        System.out.println(myAccount.getBalance());
//        myAccount.withdrawFounds(99);
//        System.out.println(myAccount.getBalance());
//        myAccount.withdrawFounds(99999999);
//        System.out.println(myAccount.getBalance());

        BankAccount mySecondAccoutn=new BankAccount(811009, 999,
                "Krowa", "krowa@krowa.pl", "+45 123456798");

        System.out.println(mySecondAccoutn.getCustomerName());

        BankAccount krowaAccount=new BankAccount();
        System.out.println(krowaAccount.getCustomerName());

        BankAccount kurczakAccount=new BankAccount("Kurczak", "kurczak@kurczak.pl", "11-222-333");
        System.out.println(kurczakAccount.getCustomerName() + '\t' + kurczakAccount.getPhoneNumber());

        VipCustomer one=new VipCustomer();
        VipCustomer two=new VipCustomer("Cust. two", 9999);
        VipCustomer three=new VipCustomer("Cust. three", 111, "three@com.com");

        System.out.println(one.getEmail());
        System.out.println(two.getName());
        System.out.println(three.getCreditLimit());
    }
}
