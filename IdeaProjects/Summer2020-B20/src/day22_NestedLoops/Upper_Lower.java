package day22_NestedLoops;

import java.util.Scanner;
// write a program that asks user to enter a string. if string started with upper case and end
public class Upper_Lower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);

        boolean start = firstChar >= 'A'  && firstChar<='Z';  // upper case characters
        boolean end = lastChar >='a' && lastChar <= 'z';
//        System.out.println(start && end);

        if( start && end){
            System.out.println("true");
        }else{
            System.out.println("false");
        }








































































    }





































































}
