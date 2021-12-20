package b_collectionsPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static String removeDuplicate(String str) {

        //    String str = "aabbbfssccddd";  // needs to return abfscd
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i);
            }
        }
        return result;
    }

   public static String useSetMethodRemoveDuplicate(String str){

       Set<String> removeDup = new HashSet<>();
      for (int i =0 ; i < str.length(); i++){
          removeDup.add(str.charAt(i)+"");
      }
      str = "";
       for (String s : removeDup) {
           str +=s;
       }
       return str;
   }

    public static void main(String[] args) {
        String str = "aabbbfssccddd";

        System.out.println(removeDuplicate(str));
        System.out.println(useSetMethodRemoveDuplicate(str));
    }

}
