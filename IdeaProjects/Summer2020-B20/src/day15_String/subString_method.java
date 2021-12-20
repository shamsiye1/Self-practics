package day15_String;

import java.util.Locale;

public class subString_method {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        //                 0123456789..
        String word = sentence.substring(0, 5+2);
        System.out.println(word);

        String word2 = sentence.substring(6, 11);
        System.out.println(word2);

        System.out.println("=====================================");

        String sentence2 = "I like Movies and TV Series";

        String word3 = sentence2.substring(7, 12);
        System.out.println(word3);

        System.out.println("======================");
String firstName ="shAMSiyA";
String firstCharacter = firstName.substring(0,1);
        System.out.println(firstCharacter);
        String rest = firstName.substring(1,firstName.length());
firstName = firstCharacter.toLowerCase() + rest.toUpperCase();
        System.out.println(firstCharacter);
        System.out.println(rest);

        System.out.println(firstName);

        System.out.println("==================================");
String lastName = "school";
String firstChar = lastName.substring(0,1); // s
        String remaining = lastName.substring(1); // chool

        System.out.println(firstChar);
        System.out.println(remaining);

        lastName = firstChar.toUpperCase() + remaining.toLowerCase();
        System.out.println(lastName);

        System.out.println("==========================");

            String s = "I like Game Of Thrones";

            String series = s.substring(7);
        System.out.println(series);

        String s2 = "I like java programming language";
        String language = s2.substring(7);
        System.out.println(language);











































    }














































































}
