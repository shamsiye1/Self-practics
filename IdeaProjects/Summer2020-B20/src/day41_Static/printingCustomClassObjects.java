package day41_Static;

import java.util.Locale;

public class printingCustomClassObjects {
    public static void main(String[] args) {
       String str= new String("Cybertek");
        System.out.println(str);
        System.out.println(new String("school"));

        System.out.println(str.toString());
        System.out.println(new String("school").toString());
        System.out.println("====================================================");


        carpet c1= new carpet();
        c1.customOrder(5,6,79,true);

        System.out.println(c1);





























    }
}
