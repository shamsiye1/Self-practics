package day36_ArrayList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Set_Methods {
    public static void main(String[] args) {
        ArrayList<Integer>list1= new ArrayList<>();
        list1.add(2);  //0
        list1.add(5);    //1
        list1.add(9);   //2
        list1.add(8);   //3
        list1.add(23);
        list1.add(25);
        System.out.println(list1);

        list1.set(list1.size()-1,0);
        System.out.println(list1);

        System.out.println("=========================");

        ArrayList<Integer>list2= new ArrayList<>();
        for (int i=1; i<=20;i++){
            list2.add(i);
        }

        System.out.println(list2);
         for (int i=0; i<list2.size(); i++){
             Integer each=list2.get(i);
             if (each%2 !=0){
                 list2.set(i,each*2);
             }else{
                 list2.set(i,each*3);
             }

         }
        System.out.println(list2);
























    }
}
