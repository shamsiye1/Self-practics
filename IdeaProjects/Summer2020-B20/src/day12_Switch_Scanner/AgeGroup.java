package day12_Switch_Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        /* write a grogram that can define the age groups of a person
            age groups are:
            Teenager ( <21)
            Adult (>=21 && <55)
            senior (>55)
            age cannot be negative or greater than 150
            note : must apply nested if
         */
        int age = 175;
        String result = "";
        boolean teenager = age < 21;
        boolean adult = age >= 21 && age < 55;
        boolean senior = age > 55;

        if (age > 0 && age < 150) {
            result = (age < 21) ? "Teenager" : (age >= 21 && age < 55) ? "Adult" :
                     "Senior";
        }else{
            result = "Invalid";
        }
        System.out.println(result);

































    }


}
