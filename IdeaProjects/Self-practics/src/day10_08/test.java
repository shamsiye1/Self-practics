package day10_08;

import java.util.ArrayList;

public class test {
    public static int action(int i){
        return i*2;
    }

    public static int action(String s){
        return s.length();
    }

    public static int action(boolean b){
        if (!b){
            return 5;
        }else {
            return 10;
        }
    }

    public static void main(String[] args) {
//        int total=0;
//        total +=action(true);
//        total +=action(6);
//        total +=action("false");
//        total +=action("four");
//        System.out.println(total);

        ArrayList<String> strs= new ArrayList<>();
        strs.add("j");
        strs.add("1");
        strs.add("i");
        strs.add("5");
        strs.remove(1);
        strs.add("e");
        strs.add("i");
        strs.remove("i");
        System.out.println(strs);

        System.out.println(strs);

    }

}
