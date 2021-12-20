package day16_String;

import java.util.Scanner;

public class Fizz_Buzz {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");

        String word1 = scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();

        boolean result = word1.length()==5 && word2.length() == 5;

        if(result){
            char ch1 = word1.charAt( word1.length()-1); // last character of the first word
            char ch2 = word2.charAt(0); // first character of the second word

            if(ch1 == ch2){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }

        }else{
            System.out.println("need to be exactly 5 chars length");
        }
     /* if (result){
     boolean b1 = word1.endWith("" + word2.charAt(0));   ==> word1 ends with first character of word two
     boolean b2 = word2.startsWith("" + word1.charAt(word1.length()-1));

     if (b1 && b2 ){
          System.out.println("Fizz");
     }else{
     System.out.println("Buzz");
     }
     }
      */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = scan1.next();
         if (word.endsWith("ly")){
             System.out.println("really???");
         }else{
             System.out.println("never mind");
         }

































































    }






























































}
