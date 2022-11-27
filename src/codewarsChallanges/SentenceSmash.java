package codewarsChallanges;

import java.util.ArrayList;

public class SentenceSmash {

    public static void main(String [] args){

        String [] arrPhrase         = {"hello", "world", "this", "is", "great"};
        StringBuffer sb             = new StringBuffer();

            //First solution
            for(int i=0; i < arrPhrase.length; i++) {
                if (arrPhrase[i] == arrPhrase[0]) {
                    sb.append(arrPhrase[i]);

                } else {
                    sb.append(" " + arrPhrase[i]);
                }

            }
                System.out.println(sb.toString());


            //Second solution
            String strJoined = String.join(" ", arrPhrase);
                System.out.println(strJoined);

    }


}

