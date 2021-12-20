package day15_String;

import java.lang.String;
import java.util.Scanner;

public class String_Intro {
 public static void main( String[] args){
     String str = "Cybertek";

     String t1 = new String("Tiger");
     String t2 = new String("Tiger");

     System.out.println(t1==t2);
     //              new String("Tiger") == new String("Tiger")==> false


     System.out.println("==================================================================");

     String c1 ="Cybertek";  // in String pool
     String c2 = new String("Cybertek"); // in String heap
     String c3 = new String("Cybertek"); // heap
     String c4 = "Cybertek";// String pool
     String c5 = "cybertek";

     System.out.println(c1==c2);  // "Cybertek" == new String("Cybertek")
     System.out.println(c2==c3);
     System.out.println(c1==c4);
     System.out.println(c4==c5);

     System.out.println("============");

     String str1 = "Java";
     str1 = "JavaScript";

     System.out.println(str1);
     str1 = "Java";

     System.out.println(str1);

























































 }







































































































}
