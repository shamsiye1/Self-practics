package a_mentorRequiredPractice;

import java.util.ArrayList;
import java.util.*;


public class Q13_UniqueNumberSumUpZero {
    public static void main(String[] args) {

        //Array -- N unique integers that sum up to 0 Write a function: that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).

        int n = 7;

        int[] arr = new int[n];

        if (n == 1) {
            arr[0] = n;
        }
        //  int x = n / 2;
        Random random = new Random(); // here the random object is use for create random number in each round,  it similar with java faker
        int x = random.nextInt(100);


        if (n > 1 && n < 100) {
            if (n % 2 == 0) {
                for (int i = 0; i < n; i += 2) {
                    arr[i] = x;
                    arr[i + 1] = -x;
                    x--;
                }
            } else {   // n%2==1
                for (int i = 1; i < n; i += 2) {
                    arr[i] = x;
                    arr[i + 1] = -x;
                    x--;  // purpose of make x decrement is make the array with unique element.
                }
            }

        }

        System.out.println(Arrays.toString(uniqueNumSum(8)));
        // System.out.println(Arrays.toString(arr));

    }


    public static int[] uniqueNumSum(int n) {

        int[] arr = new int[n];

        Random random = new Random();
        int x = random.nextInt(100);  // we can get random number each round

        if (n == 1) {
            arr[0] = 0;

        }

        if (n > 1 && n <= 100) {

            if (n % 2 == 0) {
                for (int i = 0; i < n; i += 2) {

                    arr[i] = x;
                    arr[i + 1] = -x;
                    x--;

                }

            } else {  // n%2==1  odd number

                for (int i = 1; i < n; i += 2) {

                    arr[i] = x;
                    arr[i + 1] = -x;
                    x--;

                }


            }


        }

        return arr;
    }


}
