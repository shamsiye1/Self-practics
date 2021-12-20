package day07_Unary_Shorthand;

public class LeapYear {
    public static void main(String[] args) {
      /*  1. create a class called leapyear. and write a program that can identify if the given
          is leapyear
       */
        int year = 2021;
        boolean result = year % 4 == 0;
        System.out.println(year + " is a leap year: " + result);
        System.out.println("========================================");

        int number = 2000;
        boolean result1 = number % 2 == 0;
        boolean result2 = number % 3 == 0;
        boolean result3 = number % 5 == 0;

        System.out.println(number + " is divisibible by 2: "+ result1);
        System.out.println(number + " is divisibible by 3: "+ result2);
        System.out.println(number + " is divisibible by 5: "+ result3);
    }


}
