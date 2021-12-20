package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(20);
        list.add(2);  //0
        list.add(5);    //1
        list.add(89);   //2
        list.add(75);   //3
        list.add(250);
        list.add(25);
        Collections.sort(list);
        System.out.println(list);

//
//        for (int i=list.size()-1; i>=0; i--){
//            System.out.print(list.get(i)+ " ");
//        }


        ArrayList<Integer> DescendingList= new ArrayList<>();
        for (int i= list.size()-1; i>=0;i--){
            DescendingList.add(list.get(i));
        }

        System.out.println(DescendingList);

































    }
}
