package CodingBatChallenges;

public class StartHi {

    public static void main(String[] args) {

        String str = "hi there";
        String hi = str.substring(0,2);
        boolean result;

        if(hi == "hi"){
            result = true;


        }else{
            result =  false;

        }
        System.out.println(hi);
        System.out.println(result);
    }
}




