package day44_Constructor;

public class Employee {

    String name;
    int ID;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed;
    static boolean hasSalary;

    static {  // runs first, and only one time
        isEmployed= true;
        hasSalary= true;
    }

    public void setEmployeeInfo(String name, int ID, int ssn, String jobTitle, double salary, char gender){
        this.name= name;
        this.ID= ID;
        this.ssn = ssn;
        this.jobTitle= jobTitle;
        this.salary= salary;
        this.gender= gender;


    }

    public String toString(){
        return "The employee name: "+name+ "\nID: "+ ID+"\nssn number: "+ ssn+ "\nJob Title: "+jobTitle+ "\nSalary: "+ salary+ "\nGender: "+gender;
    }





}
