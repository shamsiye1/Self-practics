package day36_ArrayList;

import java.util.ArrayList;

public class Uniques_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);  //0
        list.add(5);    //1
        list.add(89);   //2
        list.add(89);   //3
        list.add(25);
        list.add(25);
        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
            int count = 0;
            for (Integer each : list) {
                if (each == element) {
                    count++;
                }
            }

            if (count == 1) {
                uniques.add(element);
            }
        }
        System.out.println(uniques);
    }
}
