package Test2;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds:");
         inputSeconds= scan.nextInt();

         hours= inputSeconds/3600;
         inputSeconds %= 3600;

         minutes= inputSeconds/60;
         inputSeconds %= 60;

         seconds= inputSeconds;

        System.out.println(hours+ " hours, "+ minutes+ " minutes, and "+ seconds+" seconds");




















    }
}
