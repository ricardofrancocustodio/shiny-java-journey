package ExercisesOopNTU.Composition.Customer_and_Account;

public class Account {

    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance){
        this.id         = id;
        this.customer   = customer;
        this.balance    = balance;

    }

    public Account(int id, Customer customer){
        this.id         = id;
        this.customer   = customer;

    }

    public int getId(){
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return customer.getName();

    }

    public void deposit(double amount){
        this.balance = balance + amount;

    }

    public void withdraw(double amount){
        if(balance >= )
        this.balance = balance - amount;
    }

}
