package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        int age= 19;
        String firstName = "Zilnaz";
        String lastName = "muradel";
        String citizen1 = "USA";
        String citizen2 = "Canada";
        boolean eligibleAge = age > 17;
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        boolean eligibleToVote = eligibleAge && usCitizen;
        System.out.println(firstName + " "+ lastName + " is eligible to vote for Trump: " + eligibleToVote);





    }














}
