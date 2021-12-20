package a_mentorRequiredPractice;

public class Q20_SwapElemWithoutTempVarible {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println(a);
        System.out.println(b);
        System.out.println(" after non use swap");

        int c = 1;
        int d = 2;

        c = c + d;  // 3
        d = c - d;  // d = 1
        c = c - d;  // 2


        //

        System.out.println(c);
        System.out.println(d);
        System.out.println(" try to a and b value");


        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

      swapTwoNumber(40,20,0);
      swapTwoNumber(20,40);

    }


    public static void swapTwoNumber(int a, int b, int temp) {

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }

    public static void swapTwoNumber(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }


}
