package day43_Static;

import java.util.Arrays;
import static Library.Resources.a; // only import static variable
import  static Library.Resources.method1; //
import static Library.Resources.*;// import all class number from starts  class
public class Test {
    public static void main(String[] args) {

        System.out.println(staticBlock3.a);
        System.out.println(staticBlock3.b);

        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);
        System.out.println("==========================");
        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);
        System.out.println("=================================");





    }
}
