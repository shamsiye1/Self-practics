package day23_Arrays;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter two numbers");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int result = num1 + num2;
            System.out.println(result);

            System.out.println("Do you want to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();

            }

            if (answer.equals("no")) {
                break;
            }

        }

        System.out.println("Thanks for using Cybertek school calculator");

        System.exit(0);


    }


}
