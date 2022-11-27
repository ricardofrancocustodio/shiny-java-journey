package codewarsChallanges;

import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;


public class GravityFlip {


    public static int[] flip(char dir, int[] arr){
        if(dir == 'R'){
            Arrays.sort(arr);

        }else{
            Collections.reverse(Arrays.asList(arr));
        }

         return arr;
    }


}
