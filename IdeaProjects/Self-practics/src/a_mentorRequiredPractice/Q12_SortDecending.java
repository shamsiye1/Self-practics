package a_mentorRequiredPractice;

public class Q12_SortDecending {
    public static int[] sortDescendingNum(int[] arr) {
        // int arr[] = {1,2,5,6,3}

        int temp;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] < arr[j + 1]) {  // < for descending

                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }


            }


        }

        return arr;
    }

}
