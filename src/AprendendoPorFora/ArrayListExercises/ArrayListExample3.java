package AprendendoPorFora.ArrayListExercises;

import java.util.ArrayList;

//Write a Java program to update specific array element by given element.
public class ArrayListExample3 {

    public static void main(String[] args) {

        ArrayList<String> list      = new ArrayList<String>(); //creates an array of strings
        list.add("Rodolfo");
        list.add("Carmen");
        list.add("Vitorina");
        list.add("Alex");
        System.out.println("Lista original"+ list);

        list.set(2, "Paulo");
        System.out.println("Lista atualizada"+ list);


    }





}
