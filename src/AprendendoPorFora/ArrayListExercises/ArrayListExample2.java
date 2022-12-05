package AprendendoPorFora.ArrayListExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

import static java.rmi.Naming.list;

//Write a Java program to retrieve an element (at a specified index) from a given array list
public class ArrayListExample2 {

    public static void main(String[] args) throws IOException {

        String [] names             = {"Rodolfo", "Carmen", "Vitorina", "Alex"};
        ArrayList<String> list      = new ArrayList<String>();


            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String number = reader.readLine();
            int num = Integer.parseInt(number);

            // Printing the read line
            //System.out.println(name);
            System.out.println(names[num]);

    }
}
