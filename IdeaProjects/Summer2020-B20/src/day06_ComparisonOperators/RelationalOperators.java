package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean r2 = 100 < 9000;
        System.out.println(r2);


        //>=
        boolean r3 = 87 >= 85;
        System.out.println(r3);

        boolean r4 = 877 >= 878;
        System.out.println(r4);

        boolean r5 = 200 <= 300;
        System.out.println(r5);

        // ==: equal
        boolean r7 = true == false;
        System.out.println(r7);

        // !=
        boolean r12 = true != false;
        System.out.println(r12);

        boolean result2 = 100 == 100.0;
        System.out.println(result2);

        boolean result3 = 10 == 10.99999999999;
        System.out.println(result3);

        boolean result4 = "100" == "100.0";
        System.out.println(result4);

        int number = 100;
        boolean even = 100 % 2 == 0;
        System.out.println(even);






    }


}
