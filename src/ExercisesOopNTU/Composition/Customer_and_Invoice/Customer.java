package ExercisesOopNTU.Composition.Customer_and_Invoice;

public class Customer {

    private int id;
    private String name;
    private int discount; //in percent

    public Customer(int id, String name, int discount){

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
        return "name("+ id +")(discount "+ discount +" in %)";
    }







}
