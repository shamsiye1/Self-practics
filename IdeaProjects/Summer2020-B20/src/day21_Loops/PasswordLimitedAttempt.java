package day21_Loops;

import java.util.Scanner;

public class PasswordLimitedAttempt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name");
        String userNameInput= scan.nextLine();

        System.out.println("Enter your password");
        String inputedPassword = scan.nextLine();

        String userName= "Shamsiye";
        String passWord = "mx515";
        int remaningTry = 2;

        if (inputedPassword.equals(passWord) && userNameInput.equalsIgnoreCase(userName)){
          //inputedPassword = scan.nextLine();
            System.out.println("logged in");
        }else if(!inputedPassword.equalsIgnoreCase(passWord) || !userNameInput.equalsIgnoreCase(userName)){
            for(int i= 1; i<=2; i++){
                System.out.println("Re-enter your user name, you have " + remaningTry + " times");

                remaningTry --;
                userNameInput = scan.nextLine();
                System.out.println("Re-enter your password");
                inputedPassword= scan.nextLine();
                if(inputedPassword.equalsIgnoreCase(passWord) && userNameInput.equalsIgnoreCase(userName)){
                    System.out.println("logged in");
                    break;

                }
            }

            System.out.println("lock the account");
        }





























































    }



























































}
