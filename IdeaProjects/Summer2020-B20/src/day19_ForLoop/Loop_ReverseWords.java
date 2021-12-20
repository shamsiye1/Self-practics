package day19_ForLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Loop_ReverseWords {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter word");
        String str = scan.next();

        for (int i=str.length()-1; i>=0; i-- ){
            System.out.print(str.substring(i,i+1));
        }
        System.out.println();
        System.out.println("=====================");

        System.out.println("Enter palindrome");
        //String palin = scan.next();
        String palin = "121";

        String reversPalin ="";
        for (int i = palin.length()-1; i >=0 ; i--){
            reversPalin += palin.charAt(i)+ "";
        }
        System.out.println(reversPalin);

        if(reversPalin.equalsIgnoreCase(palin))
            System.out.println("true");
        else
            System.out.println("false");


        // level




















































































    }






























































}
