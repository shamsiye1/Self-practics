package day35_ArrayList;

import java.util.ArrayList;

public class reversedArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(2,45);
        list.add(1);

        System.out.println(list);
        for (int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

























    }






















}
