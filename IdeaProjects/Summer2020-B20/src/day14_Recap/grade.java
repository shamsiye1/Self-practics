package day14_Recap;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score");
        double score = scan.nextDouble();
scan.close();
        String result = "";
        if (score >= 0 && score <= 100) {
            if (score >= 90 && score <= 100) {
                result = "Excellent";
            } else if (score >= 80 && score < 90) {
                result = "Great";
            } else if (score >= 70 && score < 80) {
                result = "Good";
            } else if (score >= 60 && score < 70) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid score";
        }
        System.out.println(result);

    }


}
