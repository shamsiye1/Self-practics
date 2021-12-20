package a_mentorRequiredPractice;

import java.util.Arrays;

public class Q02_SameLetters {
    public static void main(String[] args) {

        String name = "abc";
        String name2 = "cabv";

        System.out.println(isSame(name, name2));
//        boolean isSame=false;
//
//        if (name.length()!=name2.length()){
//            isSame= false;
//        }
//
//        char[] arr= name.toCharArray();
//        char[] arr2= name2.toCharArray();
//
//        Arrays.sort(arr);
//        Arrays.sort(arr2);
//
//        isSame= Arrays.equals(arr,arr2);
//
//        System.out.println(isSame);
//    }
    }

    public static boolean isSame(String str, String str2){

        char[] arr= str.toCharArray();
        char[] arr2= str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

     return    Arrays.equals(arr,arr2);


    }


}