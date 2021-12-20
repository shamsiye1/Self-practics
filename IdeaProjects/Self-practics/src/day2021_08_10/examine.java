package day2021_08_10;

import java.util.Scanner;

public class examine {
    public static void main(String[] args) {

//        int a = 5;
//        //byte b =a;
//
//        //  System.out.println(b);
//
//
////int num=-5;
////        System.out.println(num++ +",");
////        System.out.println(num=0);
////        System.out.println(","+ --num);
//
//        short s2 = 13 - 9 / 3 * 10;
//        s2 += -10;
//        System.out.println(s2);
//
//        System.out.println("==============");
//        boolean one = ('a' != 'z') && false;
//        boolean two = one || 0 == (9 - 10 + 1);
//        System.out.println(two);
//
//        System.out.println("==============");
//        long l = 100;
//        short s1 = (short) l;
//        System.out.println(s1 + 10);
//        System.out.println("===========");
//        int a1 = 10;
//        a1 = --a1 + a1++ + a1-- + a1++;
//        System.out.println(a1);
//
//        System.out.println("=====================");
//        short s = 13 + 3 * (10 - 6) % 2;
//        boolean b1 = s != 25;
//        System.out.println(b1);
//
//
////        double number=5;
////        switch (number){
////
////        }
////
////
////
////
////
//
//        byte b = 104;
//        boolean check = b < 100;
//
//        if (check) {
//            b -= 100;
//        } else {
//            b = 50;
//        }
//
//        System.out.println(b);
//
//        if (183 == 13 + 50 * 2 + 70) {
//            System.out.println("j");
//        } else {
//            System.out.println("s");
//        }
//
//        System.out.println("========================");
      boolean b= true;
        int num = 2;

        switch (num) {
            case 0:
                b = false;
                break;
            case 1:
                System.out.println(1);
            case 2:
                if (b){
                    System.out.println(2);
                }else {
                    b= false;
                }
            case 3:
               if (b){
                   System.out.println(3);
                   b=false;
               }else {
                   break;
               }
            case 4:
                System.out.println(4);

            case 5:
               if (!b){
                   break;
               }
                System.out.println(5);


        }

//
//
//        double pi=3.14;
//        boolean b2= 119%5==0;
//        int number=0;
//        if (pi>3.14 && !b2){
//            number+=50;
//        }else {
//            number -=50;
//        }
//        if (b2){
//            number+=50;
//        }
//        System.out.println(number);
//
//        double decimal = 13.142;
//        int whole= decimal <20 ? 20:10;
//        System.out.println(whole);
//
//        int checking =132;
//        String str1="";
//
//if (checking %2==0){
//    str1 +=checking;
//   if (checking%5==0){
//   str1 +="132";
//   }else{
//       str1= "500";
//
//   }
//}else {
//    str1 +="123";
//}
//        System.out.println(str1);


        Scanner scan= new Scanner(System.in);
//        int one= scan.nextInt();
//        int two= scan.nextInt();
//
//if (one-- > two*2){
//    System.out.println("one");
//}else {
//    System.out.println(two);
//}
//            String str= scan.nextInt();
//
//        byte b1= scan.nextByte();
//        byte b2= scan.nextByte();
//        int max= (b1>b2) ? b1+2: b2-4;
//        System.out.println(max);

        boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlexible = scan.nextBoolean();
       String sport= "";

       if (isTall){
           if (isFast){
               sport="bas";

           }else if (isFlexible){
               sport="gym";
           }else {
               sport= "volley" ;
           }
       }else {
           if (isFast){
               sport="socc";
           }else {
               sport="ten";
           }
       }
        System.out.println(sport);




































    }
}

