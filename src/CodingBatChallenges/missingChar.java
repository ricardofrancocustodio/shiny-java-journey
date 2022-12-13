package CodingBatChallenges;

public class missingChar {

    public static void main(String[] args) {
        String str  = "kitten";
        int n       = 1;

        char rmchar = str.charAt(n);
        String strRes = Character.toString(rmchar);
        String result = str.replace(strRes, "");

        System.out.println(result);
    }
}
