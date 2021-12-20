package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Frequency {
    public static void main(String[] args) {
        String str= "aabbddckkdfcldmjh";
        ArrayList<String> list= new ArrayList<>();
        String uniques="";

        for (int i=0; i< str.length();  i++){
            list.add(str.charAt(i)+"");
        }
        System.out.println(list);

        for (int i=0; i<list.size(); i++){
            int count= Collections.frequency(list, list.get(i));
            if (count==1){
                uniques= uniques+ list.get(i)+ " ";
            }
        }


        System.out.println(uniques);





























    }
































}
