package day40_CustomClass_Practice;

public class offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary, String state, boolean hasPTO, boolean isFullTime, boolean isWFH, String jobTitle, boolean hasBenefit){

        this.salary= salary;
        this.state= state;
        this.hasBenefit= hasBenefit;
        this.hasPTO= hasPTO;
        this.isWFH= isWFH;
        this.jobTitle= jobTitle;
        this.isFullTime= isFullTime;

    }

    public void getOfferInfo(){  // display the info

        System.out.println("=============================================");

        System.out.println("Salary: "+ salary);
        System.out.println("Job title: "+jobTitle);
        System.out.println("Location: "+state);

        System.out.println("=====================================");

    }

}
