package day24_Arrays;

public class uniqueNumber {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3};

        int num1 = arr[0];    //1
        int count =0;
        for(int i = 0; i<=arr.length-1; i++){
            int each = arr[i];  // 1  1  2  3  3
            if (each == num1){
                count++;
            }
        }
        if (count==1){
            System.out.println(num1);
        }
        if(count == 1){
            System.out.println(num1);
        }
    }


































































}
