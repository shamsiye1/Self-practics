package day44_Constructor;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;
import java.util.Arrays;
//import static day44_Constructor.HumanResources.*;  //  imports all statics from HumanResours class.
public class BankOfAzerbaijan {
    public static void main(String[] args) {

        ArrayList<Employee> list= new ArrayList<>();
//        list.add(HumanResources.employee1);
//        list.add(HumanResources.employee3);
//        list.add(HumanResources.employee5);  ===> this meas that we can all as individual , bottom we also can call with one time.

       // list.addAll(Arrays.asList(HumanResources.employee1,employee3,employee2));
        //  by using static import we are able to import the static members, so can call them without the class.


        list.addAll(Arrays.asList(HumanResources.employee1, HumanResources.employee2,HumanResources.employee3));

        System.out.println("Total Number of employees: "+list.size());
        System.out.println("===================================================");

        for (Employee each: list){
            System.out.println(each.name+ " : "+ each.salary);
        }



























    }
}
