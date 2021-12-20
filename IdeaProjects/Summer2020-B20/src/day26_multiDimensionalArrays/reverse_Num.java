package day26_multiDimensionalArrays;

import java.util.Arrays;

public class reverse_Num {
    public static void main(String[] args) {
     int[][] arr2D= {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

     for(int i= arr2D.length-1; i>=0; i--){
         int[] arr1D= arr2D[i];
         //System.out.println((Arrays.toString(arr1D)));
         for(int j= arr1D.length-1; j>=0; j--){
             int arr= arr1D[j];
             System.out.print(arr+ " ");
         }
         System.out.println();
     }


        System.out.println("=========================================");

     for(int i=0; i<arr2D.length; i++){
         int[] arr1D= arr2D[i];
         for(int j= arr1D.length-1; j>=0; j--){
             int arr= arr1D[j];
             System.out.print(arr+ " ");
         }
         System.out.println();
     }














































    }










































































































}
