package day44_Constructor;

public class HumanResources {

    static Employee employee1;   // static variable alayidiliki:  we can call it from the class name.
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    static{  // as soon as the class called, the static variables need to be set
        employee1= new Employee();
        employee2= new Employee();
        employee3= new Employee();
        employee4= new Employee();
        employee5= new Employee();

        employee1.setEmployeeInfo("nazakat",458225, 12555,"SDET",120000,'F');
        employee2.setEmployeeInfo("shamsiye",458225, 160055,"QA",125000,'F');
        employee3.setEmployeeInfo("zilnaz",448725, 199755,"Tester",180000,'F');
        employee4.setEmployeeInfo("asiya",958225, 128955,"SDET",118000,'F');
        employee5.setEmployeeInfo("muradil",4578525, 789555,"DEVOP",320000,'m');


    }


}
