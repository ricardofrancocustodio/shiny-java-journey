package CodingBatChallenges;

/*
* Given a string, we'll say that the front is the first 3 chars of the string.
* If the string length is less than 3, the front is whatever is there.
* Return a new string which is 3 copies of the front.
* */

public class front3 {

    public static void main(String[] args) {
        String str      = "code";
        String result   = "";
        String front    = "";
        int b           = str.length();

        //verify if variable string has less than 3 chars or if it is empty
        if(b < 3 || str == ""){
            //get the String
            front = str.substring(0);

            //repeat string until 3 times (0,1,2)
            for(int j=0; j <=2; j++) {
                result += str;
            }

        // variable string has more than 3 chars
        }else{
            //get 3 first chars
            front = str.substring(0, 3);

            //repeat the string the same count of qty of chars (in case, 3 times)
            for(int i=0; i<front.length(); i++){
                result += front;
            }
        }

        System.out.println(result);

    }
}
