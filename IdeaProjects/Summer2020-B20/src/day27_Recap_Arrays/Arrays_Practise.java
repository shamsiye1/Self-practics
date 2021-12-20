package day27_Recap_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practise {
    public static void main(String[] args) {
        String[] names= {"shamsiye","Amubarak","patigul","akamarya"};
        //                 0            1        2         3
        System.out.println(names[2]);

        System.out.println("==============================================");
    for (int i=0; i<names.length; i++){
//        if(names[i].charAt(0) != 'A')
//continue;

         if(!names[i].startsWith("A")){
             continue;
         }



        System.out.println(names[i]);
    }

        System.out.println("============================================");

    int[] numbers= new int[5];
    numbers[3] =25;




    System.out.println(Arrays.toString(numbers));

        System.out.println("=========================================");
        Scanner scan= new Scanner(System.in);
    String[] students= new String[4];

        System.out.println("Enter a name");
students[0] = scan.nextLine();
        System.out.println("Enter a number");
        students[1]= scan.nextLine();
        for(int i= 0; i< students.length; i++){
            System.out.println("Enter a name");
            students[i] = scan.nextLine();
        }

        System.out.println("=================================");

int[] score = {55,99,45,78,25,6,3,88,44};
int max=score[0];
int min=score[0];
for (int each: score){
    if(each> max){
        max= each;
    }
    if(each<min){
        min= each;
    }
}

        System.out.println("Maximum number: "+ max);
        System.out.println("Minimum number: "+ min);

        System.out.println("==================================");




























    }














































}
