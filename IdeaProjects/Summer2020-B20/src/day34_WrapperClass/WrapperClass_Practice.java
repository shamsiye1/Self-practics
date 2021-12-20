package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {

        int[] arr= {1,2,3,6};

        Integer[] arr2={1,2,3,6};
        for (int each: arr){
            System.out.println(each);
        }

        //Double[] arr3= {1,2,3,5,4,6,7};  ===> because Wrapper class is dedicate
        Double[] arr4={1.2,2.5,3.5,7.8};


        for(double each: arr4){
            System.out.println(each);
        }

        char[] arr5={65,25,86,85};
        System.out.println(arr5);

        char ch=79;
        Character ch2=79;
        System.out.println(ch2);

        String[] nums1= {"12","13.5","14.15","15"};
        double[] nums2= new double[nums1.length];
        for(int i=0; i< nums1.length; i++){
           nums2[i]=Double.parseDouble(nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));









    }

























}
