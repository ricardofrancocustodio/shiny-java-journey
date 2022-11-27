package codewarsChallanges;

public class AWolfInSheepsClothing {
    public static void main(String[] args) {
        String [] array = {"sheep", "sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep"};
        String result = "";

        for(int i=0; i < array.length; i++){
            if(array[i].equals("wolf")){
                int d = (array.length - i) -1;
                if(d == 0){
                    result = "Pls go away and stop eating my sheep";
                }else{
                    result = "Oi! Sheep number " + d +  "! You are about to be eaten by a wolf!";
                }
            }
        }
        System.out.println(result);

    }
}
