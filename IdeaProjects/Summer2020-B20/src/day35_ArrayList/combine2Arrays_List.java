package day35_ArrayList;

import java.util.ArrayList;

public class combine2Arrays_List {
    public static void main(String[] args) {
        String[] group1= {"aliya","asiya","adila","gulira"};
        String[] group2= {"mubarak","shamsiye","patigul"};

        ArrayList<String> studentList= new ArrayList<>();

        for (String each: group1){
            studentList.add(each);
        }
        for(String each: group2){
            studentList.add(each);
        }
        System.out.println(studentList);











    }
}
