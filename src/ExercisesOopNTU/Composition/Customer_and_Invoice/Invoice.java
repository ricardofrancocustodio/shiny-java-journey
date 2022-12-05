package ExercisesOopNTU.Composition.Customer_and_Invoice;

public class Invoice {

    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount){
        this.id             =  id;
        this.customer       = customer;
        this.amount         = amount;

    }

    public int getId(){
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getAmount(){
        return amount;
    }

    public int getCustomerID(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public double getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return getAmount() - customer.getDiscount();
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void setAmount(double a){
        this.amount = a;
    }

    public String toString(){
        return "Invoice[id=" + id + ",  customer=" + customer.getName() + " (id=" + customer.getId() + ", discount=" + getCustomerDiscount() + ", amount" + amount + "]";
    }

}
