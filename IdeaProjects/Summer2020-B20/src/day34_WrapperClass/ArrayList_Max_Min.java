package day34_WrapperClass;

import java.util.ArrayList;

public class ArrayList_Max_Min {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        list.add(320);
        list.add(7800);
        list.add(200);
        list.add(5);
        list.add(100);

        for(Integer each: list){
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
        }

        System.out.println("maximum is: "+ max);
        System.out.println("minimum is: "+ min);

    }











}
