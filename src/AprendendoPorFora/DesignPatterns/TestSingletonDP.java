package AprendendoPorFora.DesignPatterns;

public class TestSingletonDP {

    public static void main(String[] args) {
        //instantiating different objects
        //access by a method that act like a constructor and return the Object
        SingletonDP singletonA = SingletonDP.getInstance();
        SingletonDP singletonB = SingletonDP.getInstance();
        SingletonDP singletonC = SingletonDP.getInstance();
        SingletonDP singletonD = SingletonDP.getInstance();

        System.out.println(singletonA);
        System.out.println(singletonB);
        System.out.println(singletonC);
        System.out.println(singletonD);


    }
}
