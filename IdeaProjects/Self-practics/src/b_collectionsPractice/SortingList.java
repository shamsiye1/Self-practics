package b_collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingList {

    public static ArrayList<Integer> sortingList(ArrayList<Integer> list) {

        //    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(44,2,889,4,64,5));

        //  Collections.sort(list);
        int[] arr = new int[list.size()];  // create new arr object
        for (int i = 0; i < arr.length; i++) {

            arr[i] += list.get(i);

        }

        int temp;    // try to use swap to ascending the arr
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

       list.removeAll(list);
        for (int k = 0; k < arr.length; k++) {

            list.add(arr[k]);

        }


        return list;
    }

    public static ArrayList<Integer> descendingList(ArrayList<Integer> list) {

        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = list.get(i);

        }

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] < arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        list.removeAll(list); // because Arrayslist can be resizable so i need to remove all element from the unordered list and add new ordered array to the list
       // ArrayList<Integer> descendingList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            list.add(arr[i]);
        }
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 8, 93, 6, 4, 88, 42, 55, 58, 77));
        // System.out.println(sortingList(list));
        System.out.println("before sorting list: " + list);
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {

            arr[i] += list.get(i);

        }

        System.out.println("before sorting array: " + Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        System.out.println("after sorting array: " + Arrays.toString(arr));
        ArrayList<Integer> newList = new ArrayList<>();
        for (int k = 0; k < arr.length; k++) {

            newList.add(arr[k]);

        }

        System.out.println(newList);


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(361, 112, 55, 9, 58, 77));
        System.out.println(sortingList(list1));
        System.out.println(descendingList(list1));
    }


}
