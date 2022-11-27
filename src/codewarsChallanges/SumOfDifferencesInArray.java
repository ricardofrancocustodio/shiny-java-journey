package codewarsChallanges;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SumOfDifferencesInArray {

    public static void main(String[] args) {

        int i;
        int r, t;
        String result;
        Integer [] arr = {1, 2, 10};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
        t = 0;
        for(i=0; i<arr.length;i++){
                //t += arr[i] +"-"+ arr[i+1] +" = "+ (arr[i] - arr[i+1]);
                t = arr[i] - arr[++i];
                System.out.println(t);

        }

    }
}
