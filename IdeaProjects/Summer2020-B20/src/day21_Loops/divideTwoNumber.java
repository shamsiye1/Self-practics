package day21_Loops;

public class divideTwoNumber {

    public static void main(String[] args) {
       int a = 10;
       int b = 3;

       if(b==0){
           System.out.println("Invalid number");
           System.exit(0);
       }
       int count = 0;
       while(a>b){
           a -= b;
           count++;
       }
        System.out.println(count+ "with a remainder of"+ a);




























































    }

































































}
