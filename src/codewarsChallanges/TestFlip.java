package codewarsChallanges;

import java.util.Arrays;
import java.util.Collections;

public class TestFlip {

    public static void main(String[] args){
        //GravityFlip gf = new GravityFlip();
        int[] newArr = new int[]{10, 20, 30, 50, 60, 40, 90, 80, 70};

       // Arrays.sort(newArr);
        Collections.reverse(Arrays.asList(newArr));

        for (int i = 0; i < newArr.length; i++)
            System.out.println(newArr[i]);

        }

}
