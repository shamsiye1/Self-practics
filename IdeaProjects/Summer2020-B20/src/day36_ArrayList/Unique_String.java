package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Unique_String {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); //aaddccbaefd
        list.add("a");
        list.add("a");
        list.add("d");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("f");

       // ArrayList<String> result = new ArrayList<>();
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
            String ch = list.get(i);
           if(!result.contains(ch)){
               result += ch + count;
           }

        }
        System.out.println(result);
    }


}

