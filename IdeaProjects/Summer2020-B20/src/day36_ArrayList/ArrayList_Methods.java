package day36_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList();
        list.add(2);  //0
        list.add(5);    //1
        list.add(89);   //2
        list.add(89);   //3
        list.add(25);
        list.add(25);
        int a = list.indexOf(89);
        System.out.println(a);
        System.out.println(list.indexOf(26));


        System.out.println(list.lastIndexOf(25));


        boolean r1= list.contains(25);
        System.out.println(r1);


        System.out.println("==========================");

        ArrayList<String> list2=new ArrayList<>();
            list2.add("cybertek");
        ArrayList<String> list3= new ArrayList<>();
             list3.add("cyber");
        System.out.println(list2.equals(list3));














    }
}
