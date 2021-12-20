package day26_multiDimensionalArrays;

import java.util.Arrays;

public class sortDesending {

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] desc = new int[arr.length];
//                  desc[0]= arr[arr.length-1];
//                  desc[1]= arr[1];
//                  desc[2] = arr[0];
        int k = arr.length - 1;
        for (int i = 0; i < desc.length; i++) {
            desc[i] = arr[k];
            k--;
        }
        System.out.println(Arrays.toString(desc));


    }


}
