package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        //  Arrays: utility class for array
        // Collections: utility for collection

        ArrayList<Integer> list= new ArrayList<>();
        list.add(20);
        list.add(2);  //0
        list.add(5);    //1
        list.add(89);   //2
        list.add(89);   //3
        list.add(25);
        list.add(25);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Maximum number: "+ list.get(list.size()-1));
        System.out.println("Minimum number: "+ list.get(0));

        System.out.println("======================================================");

        ArrayList<String> list2=new ArrayList<>();
           list2.add("A");
           list2.add("B");
           list2.add("C");
           list2.add("D");
           list2.add("E");
        System.out.println(list2);

        Collections.swap(list2,2,4);
        System.out.println(list2);

        Collections.swap(list2,0,list2.size()-1);
        System.out.println(list2);

        ArrayList<Character> charList= new ArrayList<>();
          charList.add('A');
          charList.add('B');
          charList.add('A');
          charList.add('A');
          charList.add('A');
          charList.add('C');

         int count= Collections.frequency(charList,'A');
        System.out.println(count);





























    }
}
