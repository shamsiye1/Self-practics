package day42_static;

public class Tester2 {
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, long employeeID, String jobTitle, double salary, char gender){
        this.name=name;
        this.employeeID= employeeID;
        this.gender= gender;
        this.jobTitle= jobTitle;
        this.salary= salary;
    }

    public void smokeTesting(){
        System.out.println(name+ " smoke stesting");
    }

   public void creatingTicket(){
       System.out.println(name+ " is creating ticket");
   }
   public String toString(){
        return "Name: "+ name+ " Gender: "+ gender+ ", Job titile: "+jobTitle+", Salary: "+ salary+", Employee ID: "+ employeeID;
   }














}
