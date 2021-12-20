package day06_ComparisonOperators;

public class Swap1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

       a = a + b;  //25
       b = a-b;    //15
       a = a - b;   //10
        System.out.println(a);
        System.out.println(b);

        int x = 10 ; int y = 20;

        int hold = x ;
        x = y;
        y = hold;

        System.out.println(x);
        System.out.println(y);

    }


}
