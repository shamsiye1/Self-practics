package day36_ArrayList;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Character> list= new ArrayList<>();
        list.addAll(Arrays.asList('a','b','c','d','d','c'));
        System.out.println(list);

        ArrayList<Character> nonDup= new ArrayList<>();
        for(Character each: list){
            if (!nonDup.contains(each)){
                nonDup.add(each);
            }
        }

        System.out.println(nonDup);
































    }
}
