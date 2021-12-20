package problemSolvingTask;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class SecondFrequency {

    public static void main(String[] args) {
//Create a method that will find and return the second most frequency character in a given
//String. [String, methods, loops, counter, if statement]





        String str = "succeeeess"; // s4u1c2e2

        int countFirstFreq = 0;
        int countSecondFreq = 0;

        char mostFreq = 0;
        char secondFreq = 0;

        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            // to make sure that we do;t recount the same letter twice
            if (mostFreq != str.charAt(j)) {

                for (int i = j; i < str.length(); i++) {

                    if (str.charAt(j) == str.charAt(i)) {

                        count++;
                    }

                }

                // to find the most frequent character

                if (count > countFirstFreq) {
                    mostFreq = str.charAt(j);
                    countFirstFreq = count;

                } else if (count > countSecondFreq) {
                    countSecondFreq = count;
                    secondFreq = str.charAt(j);
                }


            }


        }
        System.out.println(secondFreq);

    }


}
