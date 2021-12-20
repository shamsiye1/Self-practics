package Day32_MethodOverLoading;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5};
        int num=4;

        int[] arr2= new int[arr.length+1];

      arr2[arr2.length-1]=  num ;
        int i=0;

        for(int each: arr){
            arr2[i] =each;
            i++;

        }

        System.out.println(Arrays.toString(arr2));
        System.out.println("=======================");

        int[] scores= {85,89,88,77,55};
        int n1= 87;
        scores= addElement(scores, n1) ;
                System.out.println(Arrays.toString(scores));


        int arr22[] = subElement(arr);
        System.out.println(Arrays.toString(arr22));
    }



        public static int[] addElement(int[] arr, int num){
        int[] arr2=new int[arr.length+1];
            arr2[arr2.length-1]=  num ;
//        int i=0;
//        for (int each: arr){
//            arr2[i]= each;
//            i++;
//        }
            for(int i=0; i< arr.length; i++){
               arr2[i] = arr[i];

            }
          return arr2;

        }

        public static int[] subElement(int[] arr){
        //int[] arr={1,5,6,3};
        int[] arr2= new int[arr.length-1];

        for(int i=0; i< arr2.length; i++){
           arr2[i]= arr[i] ;
        }
        return arr2;
    }








































}
