package codewarsChallanges;

import java.util.Arrays;

public class highAndLow {

    public static void main(String[] args) {
        String [] numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4".split(" ");
        Arrays.sort(numbers);

        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }



        //System.out.println(numbers.length + " " + numbers[7]);



    }

}
