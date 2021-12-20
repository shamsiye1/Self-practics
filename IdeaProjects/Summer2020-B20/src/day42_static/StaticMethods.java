package day42_static;

public class StaticMethods {

    int a =200;
    static int b =400;

    public static void main(String[] args) {
        System.out.println(b);
     //   System.out.println(a);
        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);
   // this is only way to call the instance object

        staticMethod();

      //  instanceMethod();   cannot be call by static method
    }
    public  static void staticMethod(){

    }






}
