package ExercisesOopNTU.Composition.Customer_and_Invoice;

public class TestCustomerInvoice {

    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Ricardo", 10);
        //System.out.println(c1);

        c1.setDiscount(8);
        //System.out.println(c1);

        //System.out.println("id is: " + c1.getId() + "\n" +
         //                   "name is: " + c1.getName() + "\n" +
           //                 "discount is: " +c1.getDiscount());

        Invoice invoice = new Invoice(1, c1, 2.0 );
      //  System.out.println(invoice);

        invoice.setAmount(999.9);
        System.out.println("invoice id is: " + invoice.getId() + "\n" +
                "customer is: " + invoice.getCustomer() + "\n" +
                "amount is: " + invoice.getAmount()  + "\n" +
                "customer id is: " + invoice.getCustomerID()  + "\n" +
                "customer name is: " + invoice.getCustomerName()  + "\n" +
                "customer's discount is: " + invoice.getCustomerDiscount()  + "\n" +
                "amount after discount is: " + invoice.getAmountAfterDiscount()  + "\n"
                );


    }

}
