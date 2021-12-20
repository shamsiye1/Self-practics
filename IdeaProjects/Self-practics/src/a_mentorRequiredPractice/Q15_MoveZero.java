package a_mentorRequiredPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Q15_MoveZero {
    public static void main(String[] args) {
//        Move Zeros to the End Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};

        int[] newArr = new int[arr.length];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                newArr[count++] = arr[i];


            }

        }
        System.out.println(Arrays.toString(newArr));

        int[] arr1 = {1,0,5,0,8,0,9,0,2,3};
        System.out.println(Arrays.toString(moveZeroToRight(arr1)));
    }


    public static int[] moveZeroToRight(int[] arr){

        int[] resultArr = new int[arr.length];
         int count = 0;  // here count represents that index of new Array

         for (int i = 0; i < arr.length; i++){

             if (arr[i] != 0){

                 resultArr[count++] = arr[i];

             }

         }

         for(int i = count; i< arr.length; i++){

              resultArr[i] = 0;  // it means remain elements equal to  expected number.

         }


        return  resultArr;

    }




}
