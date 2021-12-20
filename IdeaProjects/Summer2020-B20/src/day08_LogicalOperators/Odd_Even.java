package day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {
        int number = 99;
        boolean even = number % 2 == 0;
        boolean odd = !even;
        if (even) {
            System.out.println(number + " is even number");
        }
        if (odd) {
            System.out.println(number + " is odd number");
        }

        System.out.println("====================");

        int age = 25;
        String citizenShip = "CANADA";

        boolean result = age>17 && citizenShip == "CANADA"==true;
        if ( result == true){
            System.out.println("You are eligible to vote");
        }
        if ( result == false){
            System.out.println("You are not eligible to vote");
        }









    }


}
