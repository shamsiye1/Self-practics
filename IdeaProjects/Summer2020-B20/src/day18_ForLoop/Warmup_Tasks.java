package day18_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class Warmup_Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();
        System.out.println(firstName.toUpperCase().substring(0,1)+"."+lastName.toUpperCase().substring(0,1));




    }


}
