package a_mentorRequiredPractice;

public class Q22_NumberReplaceWords {

    public static void main(String[] args) {

        int n = 24;
        String divWith2 = "Codility";
        String divWith3 = "Test";
        String divWith5 = "Coders";
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {

                System.out.println(divWith2 + divWith3 + divWith5);

            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(divWith2 + divWith3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(divWith2 + divWith5);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(divWith3 + divWith5);
            } else if (i % 2 == 0) {
                System.out.println(divWith2);
            } else if (i % 3 == 0) {
                System.out.println(divWith3);
            } else if (i % 5 == 0) {
                System.out.println(divWith5);
            } else {
                System.out.println(i);
            }


        }
        System.out.println("=====================================");
        numberReplaceWords(9);
    }

    public static void numberReplaceWords(int n) {

        String divWith2 = "Codility";
        String divWith3 = "Test";
        String divWith5 = "Coders";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(divWith2 + divWith3 + divWith5);
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(divWith2 + divWith3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(divWith2 + divWith5);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(divWith3 + divWith5);
            } else if (i % 2 == 0) {
                System.out.println(divWith2);
            } else if (i % 3 == 0) {
                System.out.println(divWith3);
            } else if (i % 5 == 0) {
                System.out.println(divWith5);
            } else {
                System.out.println(i);
            }
        }
    }

}
