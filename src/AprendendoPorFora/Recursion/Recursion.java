package AprendendoPorFora.Recursion;

public class Recursion {

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);

    }

    //works lika a loop
    static int sum(int n){
        int res = 0;

        //will have the same behaviour as a loop - from 10 to 0;
        if(n > 0){
          res = n + sum(n -1);

        }else{
            res = 0;
        }
        return res;
    }
}
