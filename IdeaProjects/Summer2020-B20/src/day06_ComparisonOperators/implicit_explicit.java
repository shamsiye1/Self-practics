package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main ( String [] args){
        short s1 = 100;
        long l1 = s1;      // implicit casting: aoutomatically done

        long l2 = (long) s1;   // if we need to manually


        System.out.println("=====================");
        double d1 = 400.555555;
        int i1 = (int)d1;
        System.out.println(i1);

        long L1= 4400;
        short sh1= (short) L1;
        System.out.println(sh1);

        int n1 = 1000;
        byte b1= (byte)n1;
        System.out.println(b1);


        double m1= 34.5;
        float f1= (float)m1;
        System.out.println(m1);


        long r1= -500;
        int p1= (int) r1;
        System.out.println(p1);






    }


















}
