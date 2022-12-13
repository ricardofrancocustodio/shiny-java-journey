package CodingBatChallenges;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */

public class frontBack {

    public static void main(String[] args) {

        String str  = "code";
        String result = "";

        for(int i=0; i<str.length(); i++){

            if (str.isEmpty() || str.length() == 1){
                result = str;

            }else{
                String firstChar    = Character.toString(str.charAt(0));
                String lastChar     = str.substring(str.length() - 1);
                String middleChars     = str.substring(1, str.length() - 1);

                result = lastChar + middleChars + firstChar;
            }

        }

        //return result;
        System.out.println(result);


    }
}
