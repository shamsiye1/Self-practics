package day17_ReCup;

import java.util.Locale;

public class String_Methods2 {

    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = new String("Cat");
        String s3 = new String("Cat");

        // equals
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s2==s3); // false
        System.out.println(s2.equals(s3)); // true

        // equalsIgnoreCase:

        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4.equalsIgnoreCase(s5));

        // isEmpty:  checks if the length of string is 0
        String str= " ";
        System.out.println(str.isEmpty());

        str = str.trim();
        System.out.println(str.isEmpty());

        String str2 = "Cybertek";
        System.out.println(str2.isEmpty());

        str2 = "";
        System.out.println(str2.isEmpty());


        String str3 = "java, C#,python, ruby, C++";
        System.out.println(str3.contains("java"));

        System.out.println(str3.contains("Java"));
        System.out.println(str3.toLowerCase().contains("java"));
        System.out.println("====================================");

        String str4 = "DABC";
        System.out.println(str4.contains("D"));

        // startsWith & endsWith:

        String str5 = "Cybertek";

        System.out.println(str5.startsWith("CyberABC"));

        System.out.println(str5.startsWith("E") || str5.startsWith("C"));

        String str6 = "today is a great day";

        System.out.println(str6.endsWith("y"));



































    }





















































}
