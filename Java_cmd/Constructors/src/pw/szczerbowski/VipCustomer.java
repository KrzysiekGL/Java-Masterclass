package pw.szczerbowski;

public class VipCustomer {

    //MARK: - Fields

    String name;
    int creditLimit;
    String email;

    //MARK: - Constructors


    public VipCustomer(){
        this("default name", 0, "default email");
    }

    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit, "default email");
    }

    public VipCustomer(String name, int creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }

    //MARK: - Getters

    public String getName(){
        return this.name;
    }

    public int getCreditLimit(){
        return this.creditLimit;
    }

    public String getEmail(){
        return this.email;
    }
}
