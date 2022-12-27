package CodingBatChallenges;

public class StringE {

    public static void main(String[] args) {
        String str = "Heelele";

        boolean res =  false;
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e'){
                count++;
            }
        }

        if(count >=1 && count <= 3){
            res = true;
        }else{
            res = false;
        }


        System.out.println(res);
    }
}
