package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;


public class Lambda_Expression {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,1,6,5,41,4,2,3,68,4));

        Predicate<Integer> leesThan5= p->  p <5;
        list.removeIf(leesThan5);
        System.out.println(list);
        System.out.println("====================================");

        Predicate<Integer> oddNumbers= p-> p%2!=0;
        ArrayList<Integer> numbers= new ArrayList<>();
        for (int i=0; i<=100; i++){
            numbers.add(i);
        }

        numbers.removeIf(oddNumbers);
        numbers.removeIf(p -> p%2==0);
        System.out.println(numbers);

        System.out.println("==================================");

        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Mary","Monica","Mehrray","musti","sumayya","hasan"));
        System.out.println(names);
        names.removeIf( each -> each.startsWith("M") && each.endsWith("y"));
        names.removeIf(Muhtar -> Muhtar.startsWith("s"));
        System.out.println(names);

        System.out.println("=============================");

        ArrayList<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,5,9,9,9,25,3,5));

        nums.removeIf(p-> Collections.frequency(nums,p) !=1);
                          // for the elements that are not unique
        System.out.println(nums);

        System.out.println("==================================");































    }

}
