package day34_WrapperClass;

public class WrapperClasses {
    public static void main(String[] args) {
        String str="123";
           // wrapper class we can  gain 123
        int a=Integer.parseInt(str);
        System.out.println(str+1);
        System.out.println(a+1);


        String str1= "7.5";
        Double D= Double.parseDouble(str1);
        System.out.println(D+1);

        String s1="true";
        boolean b1= Boolean.parseBoolean(s1);
        System.out.println(!b1);

        System.out.println("=============");

        String s2= "1000.5";
        Double d2= Double.valueOf(s2);
        System.out.println(d2*2);

        String s3= "FalSe";

        boolean r2= Boolean.parseBoolean(s3); // unboxing

        System.out.println(s3);
















    }




































}
