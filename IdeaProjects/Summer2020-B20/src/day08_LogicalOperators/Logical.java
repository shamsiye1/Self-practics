package day08_LogicalOperators;

public class Logical {
    public static void main(String[] args) {
        // != not

        int age = 15;
        String firstName = "Shamsiye";
        String lastName = "Ablimit";
        String citizenShip = "USA";
        boolean eligibleToVote = age>=18 && citizenShip== "USA";

        boolean r7 = !false && 9>8;
        System.out.println(r7);

        System.out.println(firstName+ " " + lastName + " " +"is eligible to vote: " + eligibleToVote);

        //  or
        boolean r8 = true == !false || false == true;
        boolean r9 = !false == false || true == !false;
        boolean r10 = !false && true == !false;
        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r8);






    }





}
