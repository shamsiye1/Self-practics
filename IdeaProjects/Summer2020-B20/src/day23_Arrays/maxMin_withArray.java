package day23_Arrays;

public class maxMin_withArray {
    public static void main(String[] args) {
      int[] arr = {1,5,4,5,22,9,5,};
       int max = arr[0];
        int min = arr[arr.length-1];
       for (int i = 1; i<= arr.length-1;i++){
           if(arr[i] >max){
               max = arr[i];
           }
           if(arr[i]<min){
               min = arr[i];
           }
           }

        System.out.println(max);
        System.out.println(min);
    }

















































    }















































