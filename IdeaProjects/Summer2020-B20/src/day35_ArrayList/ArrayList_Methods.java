package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String>earlyBirdsList= new ArrayList<>();
           earlyBirdsList.add("ibrahim");
           earlyBirdsList.add("virginia");
           earlyBirdsList.add("amina");
           earlyBirdsList.add("gulira");
           earlyBirdsList.add("asila");
           earlyBirdsList.set(2,"nazakat");
           earlyBirdsList.set(4,"asila");
        System.out.println(earlyBirdsList);
        earlyBirdsList.clear();
        System.out.println(earlyBirdsList);
        System.out.println(earlyBirdsList.size());

        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);  //0
        list.add(5);    //1
        list.add(9);   //2
        list.add(8);   //3
        list.add(23);   //4

        list.remove(2);
        System.out.println(list);
        System.out.println("=================");
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(2);  //0
        list1.add(5);    //1
        list1.add(9);   //2
        list1.add(8);   //3
        list1.add(23);   //4

        int a=1;
        list1.remove(a);
        System.out.println(list1);


        System.out.println("==========================");

        ArrayList<String> list3= new ArrayList<>();
        list3.add("hamit");
        list3.add("alida");
        list3.add("asila");
        list3.add("nazakat");
        list3.add("asiya");
        list3.remove(2);
        boolean r= list3.remove("asiya");
        System.out.println(r);




















    }
}
