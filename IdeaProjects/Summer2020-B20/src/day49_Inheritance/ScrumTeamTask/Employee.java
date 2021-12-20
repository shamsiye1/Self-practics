package day49_Inheritance.ScrumTeamTask;

public class Employee extends Person{

    /*
       Inherited
       name, age, gender
       getSsn(), setSsn, sleep(), setPersonInfo(name, age , gender)
      */

    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender,double Salary, int ID, String jobTitle){
        setPersonInfo(name, age, gender);
        this.salary=salary;
        this.ID=ID;
        this.jobTitle=jobTitle;
    }
    // method overloading: sets name, age, gender, salary, id , jobtitle

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString(){
        return "Name is "+name+", age is "+age+", gender type: "+gender+", Salary= $"+salary+", Employee ID: "+ID+", Job title is: "+jobTitle;
    }


}
