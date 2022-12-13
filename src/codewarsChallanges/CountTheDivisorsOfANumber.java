package codewarsChallanges;

public class CountTheDivisorsOfANumber {

    public static void main(String[] args) {
        //FALTA TERMINAR

        int count = 0;
        int n = 630;
        int i = 1;

        for (i = 2; i <= n; i++){
            int pn = n % i;
            if( pn == 0){
                System.out.println(i);
            }
        }




//        for(int i = 1; i <= 15; i++){
//           if(isPrimeNumber(i)){
//               System.out.println(i + " is prime");
//            }
//        }

    }


}
