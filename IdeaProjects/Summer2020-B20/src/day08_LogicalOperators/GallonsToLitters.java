package day08_LogicalOperators;

public class GallonsToLitters {
    public static void main(String[] args){
        double gallons= 3.785;
        double litters = 1/gallons;
        System.out.println(gallons + "gallons equal to "+ litters + " litters");

        int a = 200;
        int b = -a++ + --a * a--% 2;
           // a=201 a= 199
        // b= -200 + 199*198 % 2== -200
        System.out.println(b);

        System.out.println("=======================");

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        // z = 300 + 400- 120000+ 0.75=
        System.out.println(z);








    }





}
