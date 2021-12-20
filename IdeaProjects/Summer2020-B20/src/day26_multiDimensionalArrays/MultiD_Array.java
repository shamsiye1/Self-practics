package day26_multiDimensionalArrays;

import java.util.Arrays;

public class MultiD_Array {

    public static void main(String[] args) {
        char[] ch1= {'A','B'};
        char[] ch2= {'C','D','E'};
        char[] ch3= {'F','G','H'};

        char[][] ch2D= {{'A','B'}, {'C','D','E'}, {'F','G','H'}};
        //                 0          1              2
        System.out.println(Arrays.toString(ch2D[1]));

        System.out.println(ch2D[1][2]+ " "+ ch2D[0][1]);


        System.out.println("============================================");

        int[][] number= {{1,2,6}, {4}, {5,6,8,11},{6,9,8,5}};

        for(int i =0; i< number.length; i++){
            System.out.println(Arrays.toString(number[i]));
            System.out.println(Arrays.deepToString(number));
        }



























































    }























































}
