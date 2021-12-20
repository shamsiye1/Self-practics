package day06_ComparisonOperators;

public class SalaryCalculator {
    public static void main( String [] args){
        /* rate= 55;
        stateTaxRate = 0.04;
        federalTaxRate = 0.22;
        weeklyHours = 40;
         */
        double rate = 55;
        double stateTaxRate = 0.04;
        double fedralTaxRate = 0.22;
        int weeklyHours= 40;
        double salary = rate * weeklyHours * 48;
        double totalTax = salary* (fedralTaxRate + fedralTaxRate);
        double salaryAfterTax= salary - totalTax;

        System.out.println( "Salary before tax is: " + salary+ "USD");
        System.out.println(totalTax);
        System.out.println(salaryAfterTax);












    }











}
