package CodingBatChallenges;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class in1020 {

    public static void main(String[] args) {

        String i = "22";
        String pattern = "[20-30]";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(i);

        if(matcher.find()){
            System.out.println(matcher);
        }


    }



}
