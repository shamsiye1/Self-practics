package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,55,8,4,8,55,8,1,2,4,5,9,6));
        System.out.println(list);

        list.removeIf(p -> Collections.frequency(list, p)==1);
        System.out.println(list);

        System.out.println("=======================================================");

        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("anna","canada","bob","david","lan","abida","ebrahim","farida"));

        names.removeIf(p -> p.toLowerCase().charAt(0)!= p.charAt(p.length()-1));
        System.out.println(names);

        System.out.println("===================");

        ArrayList<Integer> grades= new ArrayList<>();
        grades.addAll(Arrays.asList(100,25,88,99,14,75,65,45,73,85,89,70));

        ArrayList<Integer> gradeOfA= new ArrayList<>();
        ArrayList<Integer> gradeOfB= new ArrayList<>();
        ArrayList<Integer> gradeOfC= new ArrayList<>();
        ArrayList<Integer> gradeOfD= new ArrayList<>();
        ArrayList<Integer> gradeOfF= new ArrayList<>();

        gradeOfA.addAll(grades);
        gradeOfA.removeIf(p -> p<90);

        System.out.println(gradeOfA);

        gradeOfB.addAll(grades);
//        gradeOfB.removeIf(p -> p>=90);
//        gradeOfB.removeIf( p-> p<80);
        gradeOfB.removeIf(p-> p>=90 || p<80);
        System.out.println(gradeOfB);

        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p-> p<70);
        gradeOfC.removeIf(p-> p>=80);
        System.out.println(gradeOfC);

        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p-> p>=70);
        gradeOfD.removeIf(p-> p<60);
        System.out.println(gradeOfD);

        gradeOfF.addAll(grades);
        gradeOfF.removeIf(p-> p>=60);
        System.out.println(gradeOfF);

        System.out.println("================================================");

        System.out.println(gradeOfA.size()+ " students made A");
        System.out.println(gradeOfB.size()+ " students made B");
        System.out.println(gradeOfC.size()+ " students made C");
        System.out.println(gradeOfD.size()+ " students made D");
        System.out.println(gradeOfF.size()+ " students failed");













    }
}
