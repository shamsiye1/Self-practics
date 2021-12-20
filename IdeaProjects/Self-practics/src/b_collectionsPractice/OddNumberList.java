package b_collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class OddNumberList {

    public static ArrayList<Integer> oddNumberList(ArrayList<Integer> list){

        ArrayList<Integer> oddNumList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            if (list.get(i) %2 == 1){

                oddNumList.add(list.get(i));
            }

        }


      return oddNumList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,5,55,2,58));
        System.out.println(oddNumberList(list));

    }


}
