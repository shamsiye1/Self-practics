package a_mentorRequiredPractice;

public class Q08_SumOfDigit {

    public static String sumOfDigit(String str) {

        // String str= "123";  // "6"

        char[] arr = str.toCharArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit(arr[i])) {
                sum += Integer.parseInt(arr[i] + "");
            }


        }

        String sumOfDigit = Integer.toString(sum);


        return sumOfDigit;
    }

    public static void main(String[] args) {

        String str = "1234a5";

        char[] arr = str.toCharArray();

        int sumOfDigit1 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit(arr[i])) {

                sumOfDigit1 += Integer.parseInt("" + arr[i]);
            }

        }
        System.out.println(sumOfDigit1);

        System.out.println(sumOfDigit(str));

    }


}
