package day24_Arrays;

public class unique2 {
    public static void main(String[] args) {
        String str = "aabbccdkgkjfkfccx"; // "dgj"
        String expectedResult = "";

        for (int j = 0; j <= str.length() - 1; j++) {  // because we need the frequency of every single character
            char ch1 = str.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {    // used for finding the frequency of ch and assigned to count
                char each = str.charAt(i);
                if (ch1 == each) {
                    count++;
                }
            }
            if (count == 1) {        // if it only occured one time
                expectedResult = expectedResult + ch1;
            }
        }
        System.out.println(expectedResult);


    }


}
