package CodingBatChallenges;

public class startOz {

    public static void main(String[] args) {

        String str      = "";
        String result   = "";


        if(str.equals("")){
            result = str;

        }else{
            String subst    = str.substring(0, 2);

            for(int i=0; i < subst.length();i++){
                if(subst.charAt(i) == 'o' || subst.charAt(i) == 'z'){
                    result += subst.charAt(i);
                }
            }
        }
        System.out.println(result);
    }


}
