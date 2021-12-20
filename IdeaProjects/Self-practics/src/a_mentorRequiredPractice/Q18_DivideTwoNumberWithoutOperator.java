package a_mentorRequiredPractice;

public class Q18_DivideTwoNumberWithoutOperator {

//    18. Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 0;

        if (num2 == 0){
            System.out.println("invalid number");
            return;
        }
        System.out.print(num1 +" devid by "+num2 +" is: ");

        int count =0;

        while(num1 >= num2) {

            num1 -= num2;

            count++;

        }

        System.out.println(count+" and remainder is "+num1);

    }



    }





