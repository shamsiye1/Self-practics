package day21_Loops;

import java.util.Scanner;

public class FindMin_Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Max = -99999999;
        int Min = 999999999;

        for (int i = 1; i<=5; i++){

            System.out.println("Enter a number");
            int userInput = scan.nextInt();

            if(userInput>Max){
                Max=userInput;
            }
            if(userInput<Min){
                Min = userInput;
            }
        }
        System.out.println("Maximum number is: "+ Max);
        System.out.println("Minimum number is: "+ Min);

































































    }























































}
