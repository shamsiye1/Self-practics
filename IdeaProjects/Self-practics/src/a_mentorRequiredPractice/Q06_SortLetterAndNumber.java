package a_mentorRequiredPractice;

import java.util.Arrays;

public class Q06_SortLetterAndNumber {
    public static void main(String[] args) {
//String -- Sort Letters and Numbers from alphanumeric String
//Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
//Ex:
//Input:  "DC501GCCCA098911"
//OutPut: "CD015ACCCG011899"


        String str = "DC501GCCCA098911ddb985";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            result += str.charAt(i);

            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                result += " ";
            } else if (Character.isDigit(str.charAt(i)) && i < str.length() - 1 && Character.isAlphabetic(str.charAt(i + 1))) {

                result += " ";
            }


        }

        System.out.println(str);
        System.out.println(result);

        String[] arr = result.split(" ");

        System.out.println(Arrays.toString(arr));

        str = "";

        for (int i = 0; i < arr.length; i++) {
            char[] arr1 = arr[i].toCharArray();

            Arrays.sort(arr1);

            for (int j = 0; j < arr1.length; j++) {
                // System.out.println(arr1[j]);
                str += arr1[j];

            }
        }

        System.out.println(str);


    }
}
