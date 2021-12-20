package day29_CustomMethods;

public class Max_Min {
    public static void main(String[] args) {
        int[] numbers= {1,5,8,9,6,8,6,88,9,5,66,400};
        maxNum(numbers);
        minNum(numbers);
    }



    public static void maxNum(int[] arr){
     int max = arr[0];
     for(int each:arr){
         if(each > max){
             max= each;
         }
     }
        System.out.println("Maximum number is "+ max);
    }

    public static void minNum(int[] arr){
      int min= arr[0];
      for(int each: arr){
          if(each<min){
              min= each;
          }
      }
        System.out.println("Minimum number is "+min);
    }




















































































































}
