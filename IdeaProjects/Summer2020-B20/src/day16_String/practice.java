package day16_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employeed?");
        // String answer =  scan.next().toLowerCase();
         String answer = scan.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employeed");
        }else{
            System.out.println("Not employee");
        }

       // contains:

        String str = " i like to learn java programming language";
        System.out.println(str.contains("pyphon"));  // false

        System.out.println(!str.contains("pypthon"));  // true

        System.out.println(str.contains("java"));  // true otherwise false

        //   startsWith():

        String s1 = "Muhtar";
        System.out.println(s1.startsWith("Mu"));
        System.out.println(s1.startsWith("J"));

        System.out.println(s1.startsWith("mu"));

        System.out.println(s1.toLowerCase().contains("mu"));  // true






















































































    }




















































































}
