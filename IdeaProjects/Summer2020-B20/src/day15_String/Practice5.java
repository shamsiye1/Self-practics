package day15_String;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your previous carrier");

        String preCarrier = input.nextLine();
        int l1 = preCarrier.length();

        System.out.println("Enter your current carrier");
        String currentCarrier = input.nextLine();
        int l2 = currentCarrier.length();

        if(l1> l2){
            System.out.println(preCarrier + " is longest String");
        }else{
            System.out.println(currentCarrier + " is longest String");
        };



















































































    }




























































}
