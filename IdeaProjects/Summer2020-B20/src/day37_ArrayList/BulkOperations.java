package day37_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        boolean r1 = list.contains(1);

        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(4);
        elements.add(2);
        elements.add(5);
        list.containsAll(elements);
        boolean r2 = list.contains(elements);

        System.out.println(r2);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        // verify that 1,2,4 are contained in the list2


        boolean r3 = list2.containsAll(Arrays.asList(10, 2, 4));
        Integer[] arr={10,20,4};
        boolean r= list2.containsAll(Arrays.asList(arr));
        System.out.println(r3);

        System.out.println(r);
        System.out.println("================================");

        ArrayList<Integer> numbers= new ArrayList<>();

        // Add: 30,25,15,55,65,75,85,95,100
        Integer[] nums= {30,25,15,55,65,75,85,95,100};
        numbers.addAll(Arrays.asList(nums));
        System.out.println(numbers);

        System.out.println("==================================");

        ArrayList<Integer>number=  new ArrayList<>();
        number.addAll(Arrays.asList(1,1,1,1,1,1,1,1,2,3,5,5,5,5,7,8,9,6,11,23));
        System.out.println(number);

        number.removeAll(Arrays.asList(1,2,5,11));
        System.out.println(number);
        System.out.println("================================");

        ArrayList<Integer>num1= new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,1,1,2,5,8,9,66,99,888,55));
        System.out.println(num1);

        // only keep the elements that are either 1, or 2, or 3, or 4,

        num1.removeAll(Arrays.asList(1,2,9));
        System.out.println(num1);











    }
}
