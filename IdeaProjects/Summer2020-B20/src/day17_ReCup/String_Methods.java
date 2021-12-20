package day17_ReCup;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
        // charAt():  should give index number
        String str =  "cybertek";
        //             0123456
        char ch1 = str.charAt(1);
        System.out.println(ch1);


        // concat()
        String str2 = "cybertek school";
                str2 = str2+" " + "school";
        System.out.println(str2);

        //length()   ===> int

        String str3 = "cybertek school";
       int l = str3.length();
        System.out.println(l);

        // lastIndex: length - 1

        char ch2 = str3.charAt(l-1);
        System.out.println("last index "+ (l-1));


        // upperCase & lowerCase
        String str4 ="cybertek";
        str4 = str4.toUpperCase();
        System.out.println(str4);

        String str5 = "JAVA";
        str5 = str5.toLowerCase();
        System.out.println(str5);


        // trim()  ===> remove the unused space

        String str6 = "     cybertek school is better than others.    ";
        str6 = str6.trim();
        System.out.println(str6);

        // subString  ===>  ending index is excluded.  beginning index included
        String str7 = "i like java language";
        //             012345678910
       String word = str7.substring(7, 10+1);
        System.out.println(word);

        String word2 = str7.substring(12);
        System.out.println(word2);

        String word4 =  str7.substring(5,9);
        System.out.println(word4);

        // indexOf & lastIndexOf   ==>  int

        String str8 = "Hello Batch 20, Have a Wonderful day";
        int i1 = str8.indexOf("W");
        int i3 = str8.indexOf("Wo");
        System.out.println(i1);
        System.out.println(str8.charAt(i1));
        System.out.println(i3);

        String str9 = "java java java";
        int i5 = str9.lastIndexOf("j");
        int i6 = str9.indexOf("java");
        System.out.println(i5);
        System.out.println(i6);


        //  replace & replaceFirst

        String s1 = "i like java, java is a programming language";
        s1 = s1.replaceFirst("java","C#");
        System.out.println(s1);






































































    }






















































































}
