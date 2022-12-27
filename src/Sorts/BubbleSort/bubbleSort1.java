package Sorts.BubbleSort;

public class bubbleSort1 {

    public static void main(String[] args) {
        int [] sort_arr = {-9,10,5,-3,1,24,-1,12,19};

        bubbleSort(sort_arr);
        sort_arr.toString();
        System.out.println(sort_arr[sort_arr.length -1] + " " + sort_arr[0]);

    }

    static void bubbleSort(int [] sort_arr){

        int tmp = 0;

        for(int i=0; i < sort_arr.length; i++){
            for(int j=1; j < (sort_arr.length - i); j++){

                if(sort_arr[j-1] > sort_arr[j]){
                    tmp             = sort_arr[j-1];
                    sort_arr[j-1]   = sort_arr[j];
                    sort_arr[j]     = tmp;

                }

            }
        }



    }


}
