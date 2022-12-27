package codewarsChallanges;

import java.util.Arrays;

public class HighestAndLowest_SiteSolution {
    public static void main(String[] args) {
        String [] num = "8 3 -5 42 -1 0 0 -9 4 7 4 -4".split(" ");

        int tmp = 0;
       // String [] num = numbers.split(" ");
        int [] arr = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();
        String res = "";

        for(int i=0; i < arr.length; i++){
            for(int j=1; j<(arr.length - i); j++){

                if(arr[j-1] > arr[j]){

                    tmp       = arr[j-1];
                    arr[j-1]  = arr[j];
                    arr[j]    = tmp;
                }
            }
        }
        res = arr[arr.length -1] + " " + arr[0];

        System.out.println(res);
    }
}
