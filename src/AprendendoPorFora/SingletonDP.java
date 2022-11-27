package AprendendoPorFora;

public class SingletonDP {

    //creates a private static global variable with the same name of the class
    public static SingletonDP singletonDP;

    //create a private constructor with no parameters
    private SingletonDP(){

    }

    //create a public static Classtype getinstance that returns singleton variable
    public static SingletonDP getInstance(){
        if (singletonDP == null){
            singletonDP = new SingletonDP();
        }

        return singletonDP;
    }
}
