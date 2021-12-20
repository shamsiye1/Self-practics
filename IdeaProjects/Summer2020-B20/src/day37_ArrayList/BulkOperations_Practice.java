package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students= new ArrayList<>();
        students.add("shamsiye");
        students.add("asila");
        students.add("nazakat");
        students.add("maryam");
        students.add("asiya");
        students.add("mubarak");

        // verify that the names ulku, bursa are contained in students list

       boolean r1=students.containsAll(Arrays.asList("mubarak","maryam"));

        System.out.println(r1);
        System.out.println("================================");

        ArrayList<String> group1= new ArrayList<>();
        // add all students names in your group
        group1.addAll(Arrays.asList("asila","asiya","samin","muhtar"));

        System.out.println(group1);
        // verify your mentor and one of your closest friend names are contained in the list

        boolean rr= group1.containsAll(Arrays.asList("muradil","kuzzat"));
        System.out.println(rr);

        System.out.println("==========================================");

        ArrayList<String>employeeName= new ArrayList<>();
        employeeName.addAll(Arrays.asList("Ahmed","Muhtar","Ahmed","virginia","beslan","ibrahim","ahmed"));
        System.out.println(employeeName);
        employeeName.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employeeName);









































    }
}
