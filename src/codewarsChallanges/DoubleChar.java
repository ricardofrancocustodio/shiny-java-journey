package codewarsChallanges;
import java.util.*;

public class DoubleChar {

    public static void main(String[] args) {

        String s = "SSttrriinngg";
        Scanner sc = new Scanner(s);

       // FALTA TERMINAR
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i)){
               s.replace(s.charAt(i),  '\u0000');
            }

        }
        System.out.println(s);


    }
}
