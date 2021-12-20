package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,55,88,4,5,9,6,98));

        //remove all the numbers that are less than5

        for (int i=0; i<list.size(); i++){
            if (list.get(i)<5){
                list.remove(i);
            }
        }

        System.out.println(list);




















    }

}
