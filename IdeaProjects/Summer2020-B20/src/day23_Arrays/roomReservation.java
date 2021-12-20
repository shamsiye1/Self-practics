package day23_Arrays;

import java.util.Scanner;

public class roomReservation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Welcome to Homeland Hotel");
while (true) {
    System.out.println("Please choose from the following");
    System.out.println("1.King Bed: $120");
    System.out.println("2. Queen Bed: $100");
    System.out.println("3.Single Bed: $80");

    int option = scan.nextInt();

    switch (option) {
        case 1:
            total = total +120;
            break;
        case 2:
            total = total+ 100;
            break;
        case 3:
            total = total +80;
    }

    System.out.println("Do you want to reserve another room?");
    String answer = scan.next().toLowerCase();
    if (answer.equals("no")){
        break;
    }
}
        System.out.println("Your total is: "+ total);
    }


}