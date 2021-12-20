package b_collectionsPractice;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyWithMap {

    public static void main(String[] args) {

        String str = "abbcccddddkf";  // a1 b2 c3 d4

        Map<Character, Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++){

            if(!map.keySet().contains(arr[i])){

                map.put(arr[i], 1);
            }else {
                map.put(arr[i] , map.get(arr[i])+1);
            }

        }
        System.out.println(map);

//        for (int i = 0; i < str.length(); i++){
//
//            if (map.get(arr[i])==1){
//                System.out.println(map.keySet());
//            }
//
//        }




    }


}
