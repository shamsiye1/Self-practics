package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(30,50,20,55,85,12,44,112,3));
       // find maximum number:
        Integer max=Collections.max(list);
        System.out.println(max);

        // find minimum number:
        Integer min= Collections.min(list);
        System.out.println(min);

        System.out.println("======================================");

        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("ramazan"," gulshan","muhtar","aliya","muhtar","alida","muhtari"));

        // replaceAll
        Collections.replaceAll(names,"muhtar","fatim");
        System.out.println(names);










    }

}
