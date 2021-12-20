package day19_ForLoop;

public class SumOfOdd {
    public static void main(String[] args) {

        int sumOfOdd = 0;
        /*
        sum+=2;
        sum + = 4;
        ....
        */

        for(int i = 1; i<1000; i+=2){

            sumOfOdd += i;  // sum of all even numbers
           // sumOfOdd= sumOfOdd+ i; <===> sumOfOdd += i;

        }
        System.out.println(sumOfOdd);

        System.out.println("===========================================");
        int sumOfEven = 0;
        for( int num= 0;num<=100;num +=2){
            sumOfEven += num;
        }
        System.out.println(sumOfEven);


























































    }

















































































}
