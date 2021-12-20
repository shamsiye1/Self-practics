package day14_Recap;

import java.util.Scanner;

public class Adress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street address");
        String streetAddress = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.next();

        System.out.println("Enter your state name");
        String StateName = input.next();

        System.out.println("Enter your zipcode");
         int zipcode = input.nextInt();

         input.nextLine();

        System.out.println("Enter your full name");
        String FullName = input.nextLine();

        System.out.println("Ship To: " );
        System.out.println("         "+ FullName);
        System.out.println("         "+ buildingNumber+ " " + streetAddress);
        System.out.println("         "+ cityName +", " +StateName +" "+ zipcode);

       // System.out.println("\nShip To: "+ FullName+"\n"+buildingNumber+" "+streetAddress+"\n"+ cityName+ ", "+ StateName+" "+zipcode);
































































    }























































}
