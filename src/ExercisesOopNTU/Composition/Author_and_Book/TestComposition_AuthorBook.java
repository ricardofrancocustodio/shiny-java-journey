package ExercisesOopNTU.Composition.Author_and_Book;

public class TestComposition_AuthorBook {

    public static void main(String[] args) {

        Author author   = new Author("John Doe", "johndoe@email.com", 'm');
        Book book       = new Book("Alice In Chains",author, 19.90, 99);

        System.out.println(author);
        System.out.println(book);

        book.setPrice(29.95);
        book.setQty(28);

        System.out.println("\n");

        System.out.println("book name is: "+ book.getName() + "\n" +
                            "book price is: " + book.getPrice() + "\n" +
                            "book qty is: " + book.getQty() + "\n" +
                            "Author's name is: " + author.getName() + "\n" +
                            "Author's email is: " + author.getEmail());

        Book anotherBook    = new Book("Pearl Jam",author, 29.19, 15);

        System.out.println("\n");

        System.out.println("book name is: "+ anotherBook.getName() + "\n" +
                            "book price is: " + anotherBook.getPrice() + "\n" +
                            "book qty is: " + anotherBook.getQty() + "\n" +
                            "Author's name is: " + author.getName() + "\n" +
                            "Author's email is: " + author.getEmail());

        System.out.println("\n");

        System.out.println(book.getAuthor().getName());

        System.out.println("\n");

        System.out.println(book.getAuthorName());
        System.out.println(book.getAuthorEmail());
        System.out.println(book.getAuthorGender());
    }



}
