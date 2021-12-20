package a_mentorRequiredPractice;

public class Q10_FindMaxInArray {
    public static Integer maxNum(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int each : arr) {
            if (each > max) {

                max = each;

            }
        }


        return max;
    }
}
