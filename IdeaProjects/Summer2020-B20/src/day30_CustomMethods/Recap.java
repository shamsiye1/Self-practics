package day30_CustomMethods;

import java.util.Arrays;

public class Recap {

    public static void main(String[] args) {
        maxNum(700, 700);
  int[] arr= {5,8,6,9,7,-5,-3,8,-45};
  printDesc(arr);

  int[] arr1={2,8,9,6,5};
  int[] arr2={9,8,6,4,2};
  combine2Arrays(arr1,arr2);

   posNegZero(-99);
   int[] num= {99,-88,-5,-9,8,22,55,0};
   for(int i=0; i< num.length; i++){
       posNegZero(num[i]);
   }



    }


    public static void maxNum(int a, int b) {
        if (a == b) {
            System.out.println("Equal");
            return;   // exits the method
        }

        if (a >= b) {
            System.out.println(a + " is maximum number");
        } else {
            System.out.println(b + " is maximum number");
        }
    }


    public static void printDesc(int[] arr){
        Arrays.sort(arr);
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3= new int[arr1.length+ arr2.length];
        int i=0;
        for(int each: arr1){
            arr3[i]= each;
            i++;
        }
        for(int each: arr2){
            arr3[i]= each;
            i++;
        }
    System.out.println(Arrays.toString(arr3));
}

public static void posNegZero(int num){
        if(num > 0){
            System.out.println(num+ " is positive");
        }else if(num<0){
            System.out.println(num+ " is negitive");
        }else if(num==0){
            System.out.println(num+ " is zero");
    }
}
















































}
