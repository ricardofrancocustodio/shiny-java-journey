package codewarsChallanges;

import java.util.Arrays;

public class HighestAndLowest {

    public static void main(String[] args) {

        String [] numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4".split(" ");
        int [] arrNum       = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        int tmp = 0;

            for(int i=0; i<arrNum.length; i++){
                for(int j=1; i < (arrNum.length - 1); i++){

                    if (arrNum[j-1] > arrNum[j]){
                        tmp         = arrNum[j-1];
                        arrNum[j-1] = arrNum[j];
                        arrNum[j]   = tmp;


                    }
                }

            }

        for(int i=0; i<arrNum.length; i++){
            System.out.println(arrNum[0] + " " + (arrNum.length -1));
        }


    }
}
