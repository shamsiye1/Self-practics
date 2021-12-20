package day33_LocalDataTime;

public class Uniques {

    public static void main(String[] args) {
        int[] arr = {22, 55, 78, 99, 66, 99, 88, 66, 22, 55, 43};

        for (int element : arr) {
            int count = 0;
            for (int each : arr) {
                if (element == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
    }


}
