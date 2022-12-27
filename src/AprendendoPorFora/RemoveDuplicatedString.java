package AprendendoPorFora;

public class RemoveDuplicatedString {

    public static void main(String[] args) {

        String str = "retrtetrfghfghfgjhtuyu";
        String res = "";

           if(str == null || str.length() < 2){
               res = str;

           }else{
               StringBuilder sb  =  new StringBuilder(str.length());
                str.chars().distinct().mapToObj(ch ->(char) ch ).forEach(ch -> sb.append(ch));

               System.out.println(sb.toString());
        }

    }

}
