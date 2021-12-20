package day24_Arrays;

public class average {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 4, 5, 4, 5, 4, 55};

        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            sum = sum + arr[i];
        }
        double avarage = sum / (double)arr.length;
        System.out.println(avarage);
    }


}
