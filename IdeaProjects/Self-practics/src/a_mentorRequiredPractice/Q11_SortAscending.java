package a_mentorRequiredPractice;

import java.util.Arrays;

public class Q11_SortAscending {

    /* Array -- Sort Ascending Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7}; arr = Sort(arr); ==>{ 7, 8, 9, 10}; */

    public static int[] ascendingArray(int[] arr) {
        //int[] arr = {10, 9, 8, 7}
        int temp;


        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {


                if (arr[j] > arr[j + 1]) {

                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }

            }

        }


        return arr;
    }

    public static void main(String[] args) {

        int a[] = {10, 9, 8, 7, -10, -8, 11, 8, 9};
        System.out.println(Arrays.toString(a));
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {   // use < for Descending order
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        int[] arr = {1,52,78,15,6,77,9};
        System.out.println(Arrays.toString(ascendingArray(arr)));
        System.out.println(Arrays.toString(Q12_SortDecending.sortDescendingNum(arr)));
    }

}
