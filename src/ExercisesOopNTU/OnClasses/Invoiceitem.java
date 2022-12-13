package ExercisesOopNTU.OnClasses;

public class Invoiceitem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public double totalPrice;

    public Invoiceitem(String id, String desc, int qty, double unitPrice){
        this.id             = id;
        this.desc           = desc;
        this. qty           = qty;
        this.unitPrice      = unitPrice;

    }


    public String getId(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double total (double unitPrice, int qty){
        totalPrice = unitPrice * qty;
            return totalPrice;
    }

    public String toString(){
        return "InvoiceItem[id=" +id+ ", desc=" +desc+ ", qty=" +qty+ ", unitPrice=" +unitPrice+ "]";

    }
}
