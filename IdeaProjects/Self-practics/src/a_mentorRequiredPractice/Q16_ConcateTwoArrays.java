package a_mentorRequiredPractice;

import java.util.Arrays;

public class Q16_ConcateTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5, 6, 8};  // 5
        int[] arr2 = {2, 5, 8, 6, 2};  // 5

        int[] finalArr = new int[arr1.length + arr2.length];
        System.out.println(Arrays.toString(finalArr));
        //int i =0;
        for (int i = 0; i < arr1.length; i++) {

            finalArr[i] += arr1[i];

        }
        System.out.println(Arrays.toString(finalArr));

        System.out.println(arr1.length);


        for (int i = 0; i < arr2.length; i++) {

            finalArr[arr1.length + i] += arr2[i]; // this is very important logic in this task, when we add first array to our new array, it can starts with o index; however when we start add 2nd array, we need to start with last element of arr1 plus i index.

        }

        System.out.println(Arrays.toString(finalArr));

        int[] str1 = {5, 8, 52, 2};
        int[] str2 = {2, 1,9,8,5,52,5};
        System.out.println(Arrays.toString(concateTwoArrays(str1, str2)));

    }

    //Write a return method that can concate two arrays

    public static int[] concateTwoArrays(int[] str1, int[] str2) {

        int[] resultArr = new int[str1.length + str2.length];

        for (int i = 0; i < str1.length; i++) {

            resultArr[i] += str1[i];

        }

        for (int i = 0; i < str2.length; i++) {

            resultArr[str1.length + i] += str2[i]; //

        }


        return resultArr;
    }


}
