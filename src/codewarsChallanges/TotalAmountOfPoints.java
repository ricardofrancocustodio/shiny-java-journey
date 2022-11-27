package codewarsChallanges;

public class TotalAmountOfPoints {

    public static void main(String[] args) {

        String [] games         = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        String [] nums;
        int  num1, num2, points = 0;

            for(int i=0; i<games.length; i++){

              String str_num    = games[i];
              nums              = str_num.split(":");
              num1              = Integer.parseInt(nums[0]);
              num2              = Integer.parseInt(nums[1]);

                if(num1 > num2){
                    points += 3;
                } else if (num1 < num2) {
                    points += 0;
                }else{
                    points += 1;
                }

            }

        System.out.println(points);
    }

}
