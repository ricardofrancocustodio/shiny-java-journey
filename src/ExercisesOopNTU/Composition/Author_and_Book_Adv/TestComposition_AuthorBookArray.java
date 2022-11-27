package ExercisesOopNTU.Composition.Author_and_Book_Adv;

public class TestComposition_AuthorBookArray {

    public static void main(String[] args) {

        //Create an Onject (Array of Strings0 with two positions
        Author [] authors       = new Author[2];
        authors[0]              = new Author("Michael Jackson", "mj@email.com", 'm');
        authors[1]              = new Author("Joana Hills", "joanahills@email.com", 'f');

        Book bookArr1           = new Book("Alice in Wonderland",authors,  19.90 );
        Book bookArr2           = new Book("Neverland", authors, 29.90);



//        System.out.println(bookArr1.getAuthorNames());
//        System.out.println("\n");
//        System.out.println(authors[0].getName());
//        System.out.println(authors[0].getEmail());
//        System.out.println(authors[0].getGender());
//        System.out.println("\n");
//        System.out.println(authors[1].getName());
//        System.out.println(authors[1].getEmail());
//        System.out.println(authors[1].getGender());

        for (int i=0; i < authors.length; i++){
            System.out.println(bookArr1.getName());
            System.out.println(authors[i].getName());
            System.out.println(authors[i].getEmail());
            System.out.println(authors[i].getGender());
            System.out.println("\n");
        }

        //Get second author of second book
        System.out.println(bookArr2.getName() + "\n " +
                            bookArr2.getAuthors()[1].getName()+ "\n " +
                            bookArr2.getPrice());


    }
}
