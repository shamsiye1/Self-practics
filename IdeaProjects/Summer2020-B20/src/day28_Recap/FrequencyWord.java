package day28_Recap;

import java.util.Scanner;

public class FrequencyWord {
    public static void main(String[] args) {
      // write a program return the frequency of a word from a string

      String str= "java java and python and java and java and";
                  // substring(0,4)
      int count =0;
      for(int i = 0; i<= str.length()-3;i++){
             String s= str.substring(i, i+3);

             if (s.equals("and")){ // str.substring(i, i+3).equals("and")
                 count++;
             }
      }

        System.out.println(count);


        System.out.println("==========================================================");

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your sentence?");
        String sentence = scan.nextLine();
        System.out.println("Enter word which you want to count?");
        String word = scan.nextLine();

         int count1 =0;

         for(int i= 0; i < sentence.length()- word.length(); i++){
             String s1= sentence.substring(i, i+word.length());
             if(s1.equals(word)){
                 count1++;
             }
         }
        System.out.println(count1);

































    }










































































































}
