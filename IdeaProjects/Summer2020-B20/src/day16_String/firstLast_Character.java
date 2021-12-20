package day16_String;

import java.util.Scanner;

public class firstLast_Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        char firstChar = word.charAt(0); //first character
        char lastChar = word.charAt(word.length()- 1);
  boolean result = firstChar==lastChar;
        System.out.println(firstChar = lastChar);


        System.out.println("============================");

      String str1 = "abcd";
      String str2 = "abcd";
      String str3 = "abcd";

      if (str1.length()== str2.length() && str1.length()== str3.length()){
          System.out.println("All words are same length");
      }else if(str1.length() !=str2.length() && str2.length() !=str3.length() && str1.length() != str3.length()){
          System.out.println("All different length");
      }else{
          System.out.println("Not Same nor different lengths");
      }




























































    }



















































}
