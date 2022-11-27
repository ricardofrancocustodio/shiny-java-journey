package codewarsChallanges;

import java.util.ArrayList;
import java.util.Stack;

public class FakeBinary {

    public static void main(String[] args){

        String numberString     = "98754156221546415145684";
        System.out.println(numberString.replaceAll("[1-4]", "0").replaceAll("[^0]", "1"));
    }
}
