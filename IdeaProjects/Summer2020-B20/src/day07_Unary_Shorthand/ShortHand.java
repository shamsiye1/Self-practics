package day07_Unary_Shorthand;

public class ShortHand {
    public static void main(String[] args) {
        int a = 100;

        a *= a;
        System.out.println(a);

        int b = 2;
        b *= 300;
        System.out.println(b);
        System.out.println(" +++++++++++++++++++++");

        // +=:
        int z = 300;
        z += 200;
        System.out.println(z);
        System.out.println("=================");

        String schoolName= "Cybertek";
        schoolName +=" School";
        System.out.println(schoolName);

        int bud= 100000;
        /*bud = bud/ 2; */
        bud /= 2;
        System.out.println(bud);
        int c = 10;
        c%= 2;
        System.out.println(c);

        double num2 = 400.5;
        num2 %= 2;
        System.out.println(num2);

        int x = 198;
        int reminder = x % 2 ;
        boolean result= reminder==1;
        System.out.println(x + " is a even number : " + result);

        byte d= 30;



    }




















}
