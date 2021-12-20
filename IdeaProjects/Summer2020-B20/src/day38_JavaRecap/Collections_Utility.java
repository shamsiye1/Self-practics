package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {

        ArrayList<Character> chars= new ArrayList<>();
        chars.addAll(Arrays.asList('r','d','g','y','t'));
        System.out.println(chars);

        Collections.sort(chars);

        System.out.println(chars);

        ArrayList<String> students= new ArrayList<>();
        students.addAll(Arrays.asList("aslan","cristina","alida","hasiyet","maryman","kiram"));
        Collections.swap(students, 1,5);
        System.out.println(students);
        Collections.sort(students);

        System.out.println(students);

        ArrayList<String> items= new ArrayList<>();
        items.addAll(Arrays.asList("coffee","coffee","egg","battery","battery","battery","hugendus"));

        int count = Collections.frequency(items, "battery");
        System.out.println(count);

        ArrayList<String> unique= new ArrayList<>();
        for (String each: items) {
           int i= Collections.frequency(items, each);
            if (i==1){
                unique.add(each);
            }
        }
        System.out.println(unique);



        ArrayList<String> unique2= new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p -> Collections.frequency(unique2, p)>1);
        System.out.println(unique2);

        ArrayList<Integer> list= new ArrayList();
        list.addAll(Arrays.asList(10,9,500,70,5,55,14,22222));
        Integer max= Collections.max(list);
            Integer min= Collections.min(list);
        System.out.println(list);
        System.out.println(max);
        System.out.println(min);





























    }
}
