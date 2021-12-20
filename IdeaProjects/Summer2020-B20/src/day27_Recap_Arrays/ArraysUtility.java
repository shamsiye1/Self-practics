package day27_Recap_Arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
   //  sort()
   // toString()
   //  equals()

        String[] names= {"shamsiye","Amubarak","patigul","akamarya"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] score= {55,99,45,78,25,6,3,88,44};

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println("Maximum: "+ score[score.length-1]);
        System.out.println("Minimum: "+ score[0]);

        System.out.println("=========================================");

        String[] s1= {"A","B","C"};
        String[] s2= {"A","B","C"};

        System.out.println(Arrays.equals(s1,s2));

        String[] s3= {"C","A","B"};
        System.out.println(Arrays.equals(s1,s3));
        Arrays.sort(s3);
        System.out.println(Arrays.equals(s1,s3));





























































    }










































































































}
