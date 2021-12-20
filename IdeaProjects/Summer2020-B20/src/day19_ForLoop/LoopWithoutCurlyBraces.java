package day19_ForLoop;

public class LoopWithoutCurlyBraces {
    public static void main(String[] args) {
        for (int i = 5; i < 10; i++) {
            System.out.println("Hello");
            System.out.println("Hello world");
        }
        System.out.println("==============");

        for (int i = 2; i < 9; i++)
            System.out.println("hello");
        System.out.println("hello world ");

        String name = "zilnaz";

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));

        }


    }


}
