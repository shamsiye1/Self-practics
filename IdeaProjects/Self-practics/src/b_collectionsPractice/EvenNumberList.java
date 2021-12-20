package b_collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumberList {
// Write a method which can identifies given number is even or odd EX: identify(5) -> "Odd" identify(6) -> "Even"
    public static ArrayList<Integer> evenNumList(ArrayList<Integer> list){

        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){

            if (list.get(i)%2 == 0){

                evenList.add(list.get(i));

            }

        }

    return evenList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>(Arrays.asList(1,2,5,8,93,6,4,88,42,55,58,77));
        System.out.println(evenNumList(List));


    }



}
