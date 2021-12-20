package day15_String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {

        String name = "Cybertek school is a great place";
        //            01234567
        // charAt(index)
        char ch1 = name.charAt(0);
        char ch2 = name.charAt(5);
        System.out.println(ch1);

         // length() ==> int
       int l= name.length();
        System.out.println(l);

        // last index : length of String -1
         int lastIndexNumber = name.length()-1;
        System.out.println(lastIndexNumber);

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        //toLowerCase():
        String name1 = "CYBERTEK SCHOOL";
                      name1 =  name1.toLowerCase();
        System.out.println(name1);

        // to UpperCase():   and should be assigned back the variable
        String name2 = "zilnaz";
        name2 = name2.toUpperCase();
        System.out.println(name2);


























































































        System.out.println();
    }








































































}
