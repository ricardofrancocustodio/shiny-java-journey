package CodingBatChallenges;

public class in3050 {

    public static void main(String[] args) {

    int a = 40;
    int b = 39;
    boolean res = false;

  if((a >= 30) && (a < 41)){
        if((b >= 30) && (b <= 40)){
            res =  true;

        }else {
            res =  false;
        }

    }else if((a >= 40) && (a <= 50)){
        if((b >= 40) && (b <= 50)){
            res =  true;
        }else{
            res =  false;
        }


    }

        System.out.println(res);
    }
}