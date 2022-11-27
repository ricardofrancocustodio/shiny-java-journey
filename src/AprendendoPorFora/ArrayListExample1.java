package AprendendoPorFora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to insert an element into the array list at the first position

public class ArrayListExample1 {

    public static void main(String[] args) {

        String [] names             = {"Rodolfo", "Carmen", "Vitorina", "Alex"};
        List<String> list           = new ArrayList<>(Arrays.asList(names));

        System.out.println("lista original: " + list);
            list.add(0,"Joca");

        System.out.println("lista alterada: " + list);

    }
}
