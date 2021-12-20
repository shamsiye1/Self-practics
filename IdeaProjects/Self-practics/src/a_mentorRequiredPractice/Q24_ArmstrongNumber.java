package a_mentorRequiredPractice;

import java.util.Arrays;

public class Q24_ArmstrongNumber {

    public static void main(String[] args) {

        int n = 407;

        String num = Integer.toString(n);
        System.out.println(num);

        int result = 0;
        char[] arr = num.toCharArray();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){

           result += arr[i]*i;


        }

        System.out.println(result);



    }
}
