package CodingBatChallenges;

public class front22 {


    public static void main(String[] args) {
        String str = "H";
        String result = "";


        int strLength = str.length();

        if(str.isEmpty() || strLength < 2){
            result = str+str+str;


        }else{
            String twoFirstChars = str.substring(0,2);
                result = twoFirstChars + str + twoFirstChars;
        }

        System.out.println(result);

    }

}
