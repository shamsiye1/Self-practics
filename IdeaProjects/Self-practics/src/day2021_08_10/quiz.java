package day2021_08_10;

import java.util.Arrays;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
//
////        String word= "   winter is coming    ";
////        word= word.trim();
////        System.out.println(word.length());
//
////
////        String a = "123";
////        String b= 5+4+a;
////        System.out.println(b);
//
//
//        String s="java is fun";
//        char c= s.charAt(4);
//        if (c == 'a') {
//            System.out.println("a");
//        }else if(c==' '){
//            System.out.println("b");
//        }else {
//            System.out.println("c");
//        }
//
//        String result= 3425 > (9*1000) ? "garden": "patio";
//        result.substring(2);
//        System.out.println(result);
//
//
//        String str="the fox ran under the bridge";
//        str=str.substring(4,17);
//        str= str.toUpperCase();
//        System.out.println(str+"ground");


//
//        String s="the game was tied at 2-2";
//        String s2= s.substring(5);
//
//        int ind1=s.indexOf("game");
//        int ind2=s2.indexOf("game");
//        if (ind1==ind2){
//            System.out.println(ind1);
//        }else {
//            System.out.println(ind2);
//        }

//        String a="today i will go to the beach";
//        boolean b=a.contains("i");
//        boolean c=a.substring(12).startsWith("go");
//
//        String result= b&&c ? "go":"don't go";
//        System.out.println(result);

//
//        for (int i=0; i<10; i++){
//            if (i % 2==0){
//                continue;
//            }
////            System.out.println(i);
////        }
//
//  int n= 5;
//  while (n<100){
//      n +=n;
//  }
//        System.out.println(n);


//        String w="java";
//        int a =0;
//        do {
//            System.out.println(w.charAt(0));
//            a++;
//        }while (a> w.length());
//
//
//        String str="The whole time it was raining.";
//        do {
//            System.out.print(str.charAt(0));
////            str= str.substring(3);
//
////        }while (!str.isEmpty());
//
//        String s="i will find the lost book";
//        String word="";
//
//        for (int i=s.length()-1; i<=0; i--){
//            word +=s.charAt(i);
//        }
//        System.out.println(word);
//        String str="cybertek";
//
//        for (int i=0; i<= str.length(); i+=2){
//            System.out.println(str.charAt(i));
//        }

//        String input="today it will be 100 degrees !";
//        int n=0;
//
//        while (n++ <input.length()){
//            if (n==8){
//                continue;
//            }else if (n==9){
//
//                break;
//            }
//            System.out.print(input.charAt(++n));
//        }
//
//        Scanner i= new Scanner(System.in);
//
//        int n1=i.nextInt();
//        int n2=i.nextInt();
//        int iterate=i.nextInt();
//
//        int total=0;
//        for (int j=0; j<iterate; j++){
//            if (j%3==0) continue;
//            total += n1+n2;
//        }
////        System.out.println(total);
//
//        int count=0;
//        for (int a=0; a<4; a++){
//            if (a==3) continue;
//
//            for (int b=a+1; b<5; b++){
//            count++;
//            if (b ==3) break;
//            }
//        }
//
//        System.out.println(count);
//
//        String s[] =new String[4];
//        //short numbers []= new String[10];
//
//        char chars[]= new char[26];
//
//
//        boolean [] bool= {true, true, false, true};
//
//
//        int[] nums= new int[5];
//        int a=5;
//
//        nums[2]=a;
////        nums[0]=a*2;
////        nums[4]=nums[1]*a;
////        nums[1]=nums[2];
////        nums[3]=nums[a-3];
////        System.out.println(Arrays.toString(nums));
//
//
////        double[] doub= new double[4];
////        doub[0]= 1.0;
////        doub[2]= 42.1;
////        doub= new double[4];
////        doub[1]= 17.2;
////        doub[3]= doub.length;
////        System.out.println(Arrays.toString(doub));
////
////   byte [] b={1,2,3};
////
////   for (int j=0; j< b.length; j++){
////       b[j]= (byte) (b[j]*2);
////   }
////
////        System.out.println(Arrays.toString(b));
//
//        String [] words= {"one","two","three","four"};
//        String[] other= new String[words.length];
//
//        for (int i=0; i< words.length; i++){
//            other[i]= words[i]+ words[i].length();
//        }
//
//        System.out.println(Arrays.toString(other));
//
//
//        int [] arr= {1,3,12,5,24,7,9,10};
//        boolean [] bArr= new boolean[arr.length];
//
//        for (int i=0; i< arr.length; i++){
//            if (arr[i] % 2==0){
//                bArr[i]= true;
//            }
//        }
//        System.out.println(Arrays.toString(bArr));

        int[] nums={14,1,84,97,1243,46};
        int total=0;
        for (int i=0; i< nums.length; i++){
            if (nums[i] % 2 !=0){
                total +=5;
            }else {
                total +=10;
            }
        }
        System.out.println(total);

        String[] things= {"house","shed","slide","zebra","park","garden"};

        for (String s: things){

            switch (s.charAt(1)){

                case 'h':
                    System.out.println(1);
                break;
                case 'a':
                    System.out.println(2);
                case 's':
                    System.out.println(3);
                    break;
                case 'o':
                default:
                    System.out.println(4);
                case 'p':
                    System.out.println(5);
                    break;
                case 'z':
                    System.out.println(6);
                case 'l':
                  break;
                case 'g':
                    System.out.println(7);





            }



        }
























    }
}
