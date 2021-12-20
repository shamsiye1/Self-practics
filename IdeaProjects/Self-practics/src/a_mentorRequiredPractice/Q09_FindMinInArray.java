package a_mentorRequiredPractice;

public class Q09_FindMinInArray {

    public static Integer minNum(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int each : arr) {

            if (each < min) {
                min = each;
            }

        }


        return min;
    }

    public static void main(String[] args) {
        int[] arr= {9,5,8,9,41,-47};
        System.out.println(minNum(arr));
    }
}


