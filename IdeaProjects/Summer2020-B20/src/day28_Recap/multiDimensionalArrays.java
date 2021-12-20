package day28_Recap;

import java.util.Arrays;

public class multiDimensionalArrays {

    public static void main(String[] args) {
       int[] arr1D ={1,2,3};

       int[][] arr2D= {{5,6,9},{10,2,5,6}};

       for(int i=0; i< arr2D.length; i++){

          int[] each1DArrays = arr2D[i];
          // System.out.println(Arrays.toString(each1DArrays));
           for(int j=0; j<each1DArrays.length; j++){

               int eachNum= each1DArrays[j];
               if(eachNum %2==0) {
                   System.out.print(eachNum + " ");
               }
           }

           System.out.println();
       }

        System.out.println("==========================");

         for(int[] each1D: arr2D){
             for(int eachElement:each1D){
                 if( eachElement %2 !=0 ) {
                     System.out.print(eachElement + " ");
                 }
             }
             System.out.println();
         }




























































    }




















































}
