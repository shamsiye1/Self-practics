package a_mentorRequiredPractice;

public class Q21_DivisibleBy3_5_15 {

    public static void divisibleBy3_5_15() {

        String divideBy15 = "";
        String divideBy5 = "";
        String divideBy3 = "";
        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                divideBy15 += i + " ";

            } else if (i % 3 == 0) {

                divideBy3 += i + " ";
            } else if (i % 5 == 0) {

                divideBy5 += i + " ";
            }

        }
        System.out.println("Divisible By 15: " + divideBy15);
        System.out.println("Divisible By 5: " + divideBy5);
        System.out.println("Divisible By 3: " + divideBy3);
    }

    public static void main(String[] args) {

        divisibleBy3_5_15();
    }

}





