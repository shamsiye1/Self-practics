package day25_Practices;

public class CountOddEven {
    public static void main(String[] args) {
        int[] nums={5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int countEven= 0;
        int countOdd= 0;

        String even="";
        String odd="";

        for(int each: nums ){  // for(int i= 0; i<nums.length(); i++){
                              //arr[i].length }
            if( each%2 ==0){
                countEven= countEven+1;
                even=even+ each+ " ";  //
            }else{
                countOdd++;
                odd = odd+ each+ " ";
            }
        }

        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);




















































    }

























































}
