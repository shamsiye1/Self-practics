package a_mentorRequiredPractice;

public class Q17_IdentifyNumber {

    public static String identifyNumber(int num){

        if(num %2 == 0){
            return "even";
        }else if (num %2 == 1){
            return "odd";
        }

     return null;

        // we can also use ternary Ex: return n %2 == 0 ? "even":"odd"
    }

    public static void main(String[] args) {

        int num =190;
        System.out.println(identifyNumber(num));



    }

}
