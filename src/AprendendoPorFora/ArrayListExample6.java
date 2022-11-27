package AprendendoPorFora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Write a Java program to sort a given array list.
public class ArrayListExample6 {

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
        list.add("Joca");

        Collections.sort(list);

        System.out.println(list);
    }
}
