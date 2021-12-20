package day15_String;

import java.util.Scanner;

// write a program that asks the user enter first name then last name.
//   print the initials of  the person
public class String_Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();  // cybertek
               char ch1 = firstName.charAt(3);

        System.out.println("Enter your last name: ");
        String lastName = input.next();
        char ch2 = lastName.charAt(5);

        System.out.println("Your initial is: "+ ch1+"."+ch2);

    // concat(Str)
        String schoolName = "Cybertek";

        schoolName.concat(" school"); // Cybertek school
        System.out.println(schoolName);
        String r1 = "Cybertek"+ 123+ 'A'+true;  //123
        System.out.println(r1);









































































    }

















































}
