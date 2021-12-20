package day24_Arrays;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");

        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n; i++ ){

            System.out.println("Enter a number");   // get user inputs and storing them in the array
            int num =scan.nextInt();
            arr[i] = num;
        }
        int max = arr[0];
        int min = arr[n-1];
        for (int i = 0; i<= arr.length-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if (arr[i]< min){
                min = arr[n-1];
            }
        }

        System.out.println("Maximum number: "+ max);
        System.out.println("Minimum number: "+ min);






















































    }




























































}
