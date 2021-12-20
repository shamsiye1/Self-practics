package day11_NestedIf_Switch;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
         /* precondition : minimum salary of 30k
        sub condition : minimum 2 years of jov history
        1 monday
        2 tuesday
        3 wednesday
        7 sunday
        invalid ==> there is no such a day
        task 3 write a program that can find the number of days in a months
                       (must apply nested)
         */
        int day = 8;
        boolean validNumber = day >= 1 && day <= 7;

        String result = "";
        if (validNumber) {
            if (day == 7) {
                result = "Saturday";
            } else if (day == 6) {
                result = "Sunday";
            } else if (day == 5) {
                result = "Friday";
            } else if (day == 4) {
                result = "Thursday";
            } else if (day == 3) {
                result = "Wednesday";
            } else if (day == 2) {
                result = "Tuesday";
            } else if (day == 1) {
                result = "Monday";
            }
        } else {
            result = "Invalid";
        }
        System.out.println(result);

        result = (day == 7) ? "Sunday" : (day == 6) ? "Saturday" : (day == 5) ?
                "Friday" : (day == 4) ? "Thursday" : (day == 3) ? "Wednesday" : (day == 2) ?
                "Tuesday" : (day == 1) ? "Monday" : "Invalid";
        System.out.println(result);

        System.out.println("===========================================================");


    }


}
