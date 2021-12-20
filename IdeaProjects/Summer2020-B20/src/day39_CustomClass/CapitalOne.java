package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        Employee employee2= new Employee();
        Employee employee3= new Employee();
        Employee employee4= new Employee();
        Employee employee5= new Employee();

        employee1.setEmployeeInfo("roman",'M', 123568544, "QA", 500790 );
        employee2.setEmployeeInfo("mubarak",'F', 123577544, "QA", 500800 );
        employee3.setEmployeeInfo("asiye",'F', 123568596, "QA", 50000 );
        employee4.setEmployeeInfo("nazakat",'F', 123548544, "QA", 4800000 );
        employee5.setEmployeeInfo("amina",'F', 123568512, "QA", 1000000 );

        ArrayList<Employee> employeeList= new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));


        for (int i=0; i<employeeList.size();  i++){
            employeeList.get(i).getEmployeeInfo();
        }

        double max= Integer.MIN_VALUE;
        for (int i=0; i<employeeList.size();  i++){
          
        }





    }
}
