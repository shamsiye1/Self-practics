package a_mentorRequiredPractice;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.xml.bind.Element;

public class Q19_FINRA {
//    Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    public static String finraTest() {
        String result = "";
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else {
                result += i + " ";
            }
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(finraTest());

    }
}
