package day34_WrapperClass;

import java.util.Arrays;

public class SortWrapperClass {

    public static Integer[] sortDesc(Integer[] arr){
        Arrays.sort(arr);
        Integer[] arr2= new Integer[arr.length];
        int k= arr.length-1;
        for(int i=0; i<arr2.length; i++){
            arr2[i]= arr[k];
            k--;
        }
        return arr2;
    }


    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);
        Double[] arr2= new Double[arr.length];
        int k= arr.length-1;
        for(int i=0; i<arr.length; i++){
            arr2[i]= arr[k];
            k++;
        }
        return arr2;
    }





}
