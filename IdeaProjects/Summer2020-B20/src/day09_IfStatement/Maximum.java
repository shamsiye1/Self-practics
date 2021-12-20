package day09_IfStatement;

import java.util.Arrays;

public class Maximum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        int arr[] = {400,300,200};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        boolean aIsMax = a > b &&  a> c;

        boolean bIsMax = aIsMax ==false && b > c;
        // or boolean bIsMax = b> a && b> c;
        boolean cIsMax =  aIsMax ==false && bIsMax==false;
        // or boolean cIsMax = c > b && c> a;
        // !aIsMax && ! bIsMax
        double max = 0; // we want to assign the maximum number to variable max
        String min = "";
        if (aIsMax){
            max = a;
            // System.out.println(a);
        }
        if(bIsMax){
            max = b;
            //System.out.println(b);
        }
        if(cIsMax){
            max = c;
            // System.out.println(c);
        }
        System.out.println(max + " is maximum number");

    }


}
