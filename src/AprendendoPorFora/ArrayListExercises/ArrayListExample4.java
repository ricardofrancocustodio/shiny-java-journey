package AprendendoPorFora.ArrayListExercises;

import java.util.ArrayList;

//Write a Java program to remove the third element from a array list.
public class ArrayListExample4 {

    public static void main(String[] args) {

        ArrayList<String> list      = new ArrayList<String>(); //creates an array of strings
            list.add("Rodolfo");
            list.add("Carmen");
            list.add("Vitorina");
            list.add("Alex");

        System.out.println("Lista original"+ list);

            list.remove(2);
        System.out.println("Lista atualizada"+ list);
    }
}
