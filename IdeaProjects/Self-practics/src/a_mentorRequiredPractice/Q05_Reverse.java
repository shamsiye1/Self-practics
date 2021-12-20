package a_mentorRequiredPractice;

public class Q05_Reverse {
    public static void main(String[] args) {

        String text = "abcd"; //==> dcba

        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {

            result += text.charAt(i) + "";

        }


        System.out.println(result);
    }

    public static String reverse(String text){

        String reverseText="";
        for (int i=text.length()-1; i>=0; i--){

            reverseText +=text.charAt(i)+"";
        }
     return reverseText;
    }

}
