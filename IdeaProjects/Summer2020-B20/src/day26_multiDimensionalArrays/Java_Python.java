package day26_multiDimensionalArrays;

import java.util.Arrays;

// write a program that can return the number of appearances of "java" and "python"
public class Java_Python {
    public static void main(String[] args) {
    String sentence= "i love java and javascript, python and java is cool";

    String[] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int countJava =0;
        int countPython=0;

        for (String each: words){
            if (each.toLowerCase().contains("java")){
                countJava++;
            }else if( each.toLowerCase().contains("python")){
                countPython++;
            }
            }

        System.out.println("java is: "+ countJava);
        System.out.println("python is: "+ countPython);
        System.out.println(countJava== countPython);
    }





































    }
















































