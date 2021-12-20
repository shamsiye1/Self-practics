package day42_static;

public class Developer2 {
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

    public void coding(){
        System.out.println(name+ " is coding");
    }
    public void fixBug(){
        System.out.println(name+ " is fixing the bug");
    }
    public String toString(){
        return "Name: "+ name+ " Gender: "+ gender+ ", Job titile: "+jobTitle+", Salary: "+ salary+", Employee ID: "+ employeeID;
    }
}
