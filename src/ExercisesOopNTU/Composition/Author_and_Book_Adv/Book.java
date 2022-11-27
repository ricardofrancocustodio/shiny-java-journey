package ExercisesOopNTU.Composition.Author_and_Book_Adv;

public class Book {

    private String name;
    private Author [] authors;
    private double price;
    private int qty;

    public Book(String name, Author [] authors, double price){
        this.name       = name;
        this.authors    = authors;
        this.price      = price;
    }

    public Book(String name, Author [] authors, double price, int qty){
        this.name       = name;
        this.authors    = authors;
        this.price      = price;
        this.qty        = qty;
    }

    public String getName(){
        return name;
    }

    public Author [] getAuthors(){
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public int getQty(){
        return qty;
    }

    public void setPrice(double p){
        this.price  = p;
    }

    public void setQty(int q){
        this.qty    = q;
    }

    public String getAuthorNames(){
        return "AuthorNames[authorName1="+ authors[0] +", authorName2="+ authors[1] +"]";
    }

}
