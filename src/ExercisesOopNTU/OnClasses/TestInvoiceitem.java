package ExercisesOopNTU.OnClasses;

public class TestInvoiceitem {

    public static void main(String[] args) {
        Invoiceitem invoice1            = new Invoiceitem("1","Produto 1", 2,   10.75);
        System.out.println(invoice1); //toString() method will display on terminal

        System.out.println("Total price: " + invoice1.total(invoice1.getUnitPrice(), invoice1.getQty()));
    }
}
