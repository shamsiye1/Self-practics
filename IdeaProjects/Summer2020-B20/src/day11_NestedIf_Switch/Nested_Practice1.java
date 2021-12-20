package day11_NestedIf_Switch;

public class Nested_Practice1 {
    /* precondition : minimum salary of 30k
       sub condition : minimum 2 years of job history
     */
    public static void main(String[] args) {
        double salary = 40000;
        int yearOnJob = 1;
        String result = "";
        if (salary >= 30000) {
            if (yearOnJob >= 2) {
                result = "You qualify for the loan";
            } else {
                result = "You must have been on job at least 2 years";
            }
        } else {
            result = "You must earn at least $30000";
        }

        System.out.println(result);


























    }






}










































































