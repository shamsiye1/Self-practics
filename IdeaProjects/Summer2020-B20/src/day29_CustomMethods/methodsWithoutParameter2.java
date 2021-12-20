package day29_CustomMethods;

public class methodsWithoutParameter2 {
    public static void main(String[] args) {

        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("shamsiye");
        printHello5X();
    }

    /*
    Access modifier  specifiers  return-type  name(){
    }
     */
    public static void printHello5X() {
        for (int i = 10; i >= 5; i--) {
            System.out.println("Hello world");

        }
    }


}
