package ExercisesOopNTU.Composition.Customer_and_Invoice;

public class Customer {

    private int id;
    private String name;
    private int discount; //in percent

    public Customer(int id, String name, int discount){
        this.id         = id;
        this.name       = name;
        this.discount   = discount;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getDiscount(){
        return discount;
    }

    public void setDiscount(int d){
        this.discount = d;
    }

    public String toString(){
        return "name("+ name +") id("+ id +") discount("+ discount +"%)";
    }

}
