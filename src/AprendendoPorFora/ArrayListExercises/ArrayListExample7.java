package AprendendoPorFora.ArrayListExercises;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to copy one array list into another.
public class ArrayListExample7 {

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

        ArrayList<String> list2     = new ArrayList<String>(); //creates an array of strings
        list2.add("Maira");
        list2.add("Tasiná");
        list2.add("Curumin");
        list2.add("David");
        list2.add("Zura");
        list2.add("Ernesto");
        list2.add("Walter");
        list2.add("Ananias");
        list2.add("Dartagnan");
        list2.add("Pedro");

        //1ª approach - Using the assignment operator(=)
        ArrayList<String> list3 = list;
        System.out.println("First Approach: "+ list3);

        //2ª approach - Passing in the constructor
        ArrayList<String> list4 = new ArrayList<>(list);
        System.out.println("Second Approach: "+ list4);

        // 3ª approach - Adding one by one using add() method
        ArrayList<String> list5 = new ArrayList<>();

        for(String value : list){
            list5.add(value);
        }
            System.out.println("Third Approach: "+ list5);

    }







}
