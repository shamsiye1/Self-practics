package carConstructorChaining;

public class SalaryCalculator {

    double hourlyRate;
    double weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    static String country;
    static {
        country="usa";
    }

    public SalaryCalculator( double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate){
         this.hourlyRate=hourlyRate;
         this.weeklyHours=weeklyHours;
         this.stateTaxRate=stateTaxRate;
         this.federalTaxRate=federalTaxRate;

    }

    public double salary(){

        return hourlyRate*weeklyHours*48;

    }

    public double stateTax(){

        return salary()*stateTaxRate;
    }

    public double federalTax(){

        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){

        return salary()-stateTax()-federalTax();
    }




}
