package day10_IfStatements;

public class MultiBranch {
    public static void main(String[] args) {
        int number = 100;
        boolean positive = number > 0;
        boolean negative = number < 0;

        if (positive){
            System.out.println(number + " is positive");
        }
        if(negative){
            System.out.println(number + " is negative");
        }
        if( number ==0){
            System.out.println(number + " is 0");
        }


        System.out.println("============================");

        if (number > 0){
            System.out.println(number + " is positive");
        }else if(number < 0){
            System.out.println(number + " is negative");
        }else{    //number=0
            System.out.println(number + " is zero");
        }
































    }































































}
