package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FrequencyOfChar {
    public static void main(String[] args) {
     String str="aabbddccooolll";
        ArrayList<String> list= new ArrayList<>();

        String result="";
        for(int i=0; i< str.length();i++){
            list.add(str.charAt(i)+"");
        }

        System.out.println(list);
        for (int i=0; i<list.size(); i++){
            int count= Collections.frequency(list, list.get(i));
            if(!result.contains(list.get(i))){
                result= result+ list.get(i)+ count;
            }

        }


        System.out.println(result);














































    }
}
