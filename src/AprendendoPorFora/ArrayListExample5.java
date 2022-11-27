package AprendendoPorFora;

import java.util.ArrayList;

//Write a Java program to search an element in a array list.
public class ArrayListExample5 {

    public static void main(String[] args) {

        ArrayList<String> list      = new ArrayList<String>(); //creates an array of strings
            list.add("Rodolfo");
            list.add("Carmen");
            list.add("Vitoria");
            list.add("Alex");
            list.add("Marcos");
            list.add("Phil");
            list.add("Carlos");
            list.add("Joana");
            list.add("Maria");
            list.add("Jo");

        if(list.contains("Jo")){
            System.out.println("Element found on the list");
        }else{
            System.out.println("Element not found on the list");
        }

    }



}
