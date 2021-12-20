package day10_17_quiz;

public class Testing {
//
//    static String name="John";
//           String id="123";
   static int a;
          int b;


    public static void main(String[] args) {
      //  System.out.println(name);
      Testing obj1= new Testing();
        obj1.b=10;
        obj1.a=20;

        Testing obj2= new Testing();
        obj2.b=30;
        obj2.a=40;
        System.out.println(obj1.a+" "+ obj1.b);
        System.out.println(obj2.a+" "+ obj2.b);
    }

}
