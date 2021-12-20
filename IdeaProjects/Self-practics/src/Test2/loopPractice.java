package Test2;

import java.util.Arrays;
import java.util.Scanner;

public class loopPractice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter five number");

//        double num1= scan.nextDouble();
//        double num2= scan.nextDouble();
//        double num3= scan.nextDouble();
//        double num4= scan.nextDouble();
//        double num5= scan.nextDouble();
// 2.6.8.12,5,19
        int[] arr = {-1,-9,-15};
        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);
//        System.out.println(arr[0]);
       int max = Integer.MIN_VALUE;

       for (int i=0; i<arr.length; i++){
           if (arr[i]>max){
               max=arr[i];
           }
       }

        System.out.println(max);

        double maxx = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter "+(i+1)+"_number");
            double num= scan.nextDouble();
            if (num>maxx){
                maxx= num;
            }
        }
        System.out.println(maxx);

    double min= Integer.MAX_VALUE;
    for (int i= 0; i<5; i++){
        System.out.println("Enter "+(i+1)+"_number");
        double num= scan.nextDouble();
        if (num< min){
            min= num;
        }
    }
        System.out.println("min number is: "+min);

        System.out.println("======================================================");

        double maximum= Integer.MIN_VALUE;
        for(int i =0; i<=5; i++){
            System.out.println("Enter randem ");
        }








    }
}

