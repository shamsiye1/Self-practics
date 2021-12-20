package day29_CustomMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class methodWithParameter {
    public static void main(String[] args) {
        printHello(5);
        System.out.println("========================");
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your birth year and current year");
//        int birthYear= scan.nextInt();
//        int currentYear= scan.nextInt();

        age(scan.nextInt(), scan.nextInt());
    }

    public static void printHello(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }

    public static void age(int birthyear, int currenYear) {
        if (currenYear < birthyear) {
            System.out.println("Invalid entry");
        } else {
            int age = currenYear - birthyear;

        System.out.println("You are " + age + " years old");
    }
}





















































}
