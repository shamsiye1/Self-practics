package b_collectionsPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacter {

    public static String uniqueCharacter(String str) {

        //    String str = "AAABCCCDDEFFS";  //  BES
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    count++;
                }

            }

            if (count == 1) {

                result += str.charAt(i);
            }

        }


        return result;
    }

    public static String useMapToFindUniqueChar(String str) {

        Map<String, Integer> map = new HashMap<>();
        // String str = "AAABCCCDDEFFS";




        return str;
    }


    public static void main(String[] args) {
        String str = "AAABCCCDDEFFS"; //
        System.out.println(uniqueCharacter(str));
     //   System.out.println(useSetToFindUniqueChar(str));
    }

}
