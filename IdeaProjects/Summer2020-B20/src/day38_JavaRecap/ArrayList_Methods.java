package day38_JavaRecap;

import day08_LogicalOperators.GallonsToLitters;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> cars= new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","Infinity","tesla","wv","lamborghini","lexus"));
        // cars.remove(3);  remove by passing index number
        //cars.remove("tesla");  // remove by passing object itself

        //cars.removeAll(Arrays.asList("tesla"));

        //cars.removeIf(p-> p.toLowerCase().contains("m"));

        cars.retainAll(Arrays.asList("tesla"));
        System.out.println(cars);

        System.out.println("==============================================");

        ArrayList<String> groceryList= new ArrayList<>();
        groceryList.addAll(Arrays.asList("egg","milk","paper towel","mango","orange","avocado"));

       boolean r1= groceryList.contains("pepsi");

        System.out.println(r1);

        boolean r2= groceryList.containsAll(Arrays.asList("egg","orange"));
        System.out.println(r2);
        System.out.println("Total number of items "+ groceryList.size());
        // set the avocado to apple
        groceryList.set(groceryList.size()-1,"apple");
        System.out.println(groceryList);


        groceryList.set(groceryList.indexOf("paper towel"), "dis washer");
        System.out.println(groceryList);
















    }
}
