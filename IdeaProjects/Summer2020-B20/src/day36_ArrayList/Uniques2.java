package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);  //0
        list.add(5);    //1
        list.add(89);   //2
        list.add(89);   //3
        list.add(25);
        list.add(25);
        ArrayList<Integer> uniques= new ArrayList<>();
        for(Integer element: list){
            int count= Collections.frequency(list,element);
            if (count==1){
                uniques.add(element);
            }

        }
        System.out.println(uniques);














































    }
}
