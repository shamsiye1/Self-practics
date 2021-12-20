package a_mentorRequiredPractice;

public class Q03_RemoveDuplicate {

    public static void main(String[] args) {
        String str = "aaavvcckxxccdd";  // avcd

//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            int count = 1;
//
//            for (int j = i + 1; j < str.length(); j++) {
//
//                if (str.charAt(i) == str.charAt(j)) {
//
//                    count++;
//                }
//
//            }
//
//            if (count == 1) {
//
//                result += "" + str.charAt(i);
//            }
//
//        }
        System.out.println(nonDup(str));
    }


    public static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int counter = 1;
            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    counter++;
                }

            }
            if (counter == 1) {

                result += "" + str.charAt(i);
            }
        }
        return result;
    }

    public static String nonDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(str.charAt(i) + "")) {

                result += str.charAt(i) + "";
            }

        }
        return result;


    }


}
