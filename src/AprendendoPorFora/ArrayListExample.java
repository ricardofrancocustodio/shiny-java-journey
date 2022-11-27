package AprendendoPorFora;

import java.util.ArrayList;
import java.util.Iterator;

// Write a Java program to create a new array list, add some names (string) and print out the collection.]
//Write a Java program to iterate through all elements in a array list

public class ArrayListExample {

    public static void main(String [] args){

        ArrayList<String> list      = new ArrayList<String>(); //creates an array of strings
        String [] names             = {"Rodolfo", "Carmen", "Vitorina", "Alex"};

        for (int i = 0; i < names.length; i++){
            list.add(names[i]);
        }

        System.out.println("This list contains the Strings added: "+list);
        System.out.println("Now let's access the list using iterator...");

        Iterator iterator = list.iterator();

            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }






    }




}
