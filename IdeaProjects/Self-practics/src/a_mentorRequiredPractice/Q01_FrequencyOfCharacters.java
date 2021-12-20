package a_mentorRequiredPractice;

public class Q01_FrequencyOfCharacters {
//    public static void main(String[] args) {
//
//      String text="AAABBCDDssssshg";  //  need to return  A3B2C1D2
//
//        String result= "";
//
//        for (int i=0; i< text.length();i++){
//
//            int counter=1;  // if we started from 0 then when in the required String one element just appear one time then there will be show 0+element
//            for (int j= i+1; j< text.length(); j++){
//
//                if (text.charAt(i)==text.charAt(j)){
//                    counter++;
//                }
//
//            }
//
//            if (!result.contains(text.charAt(i)+"")){
//
//                result += text.charAt(i)+""+counter;
//
//            }
//        }
//        System.out.println(result);
//
//    }

    public static String countLetter(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            int counter = 1;

            for (int j = i + 1; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {

                    counter++;

                }

            }
            if (!result.contains(text.charAt(i) + "")) {

                result += "" + text.charAt(i) + counter;
            }
        }

        return result;

    }


}
