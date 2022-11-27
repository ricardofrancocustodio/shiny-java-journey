package ExercisesOopNTU.Composition.Author_and_Book;

public class    Book {

    private final String name;
    private final Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price){
        this.name       =  name;
        this.author     = author;
        this.price      = price;
    }

    public Book(String name, Author author, double price, int qty){
        this.name       =  name;
        this.author     = author;
        this.price      = price;
        this.qty        = qty;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public String getAuthorName(){
        return author.getName();
    }

    public String getAuthorEmail(){
        return author.getEmail();
    }

    public char getAuthorGender(){
        return author.getGender();
    }

    public double getPrice(){
        return price;
    }

    public int getQty(){
        return qty;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public void setQty(int q){
        this.qty = q;
    }

    public String toString(){
        return "Book[name="+ name +", author="+ author +", price="+ price +", qty="+ qty +"]";

    }

}
