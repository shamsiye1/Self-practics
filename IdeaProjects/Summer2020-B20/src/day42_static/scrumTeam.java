package day42_static;

import java.util.ArrayList;
import java.util.Arrays;

public class scrumTeam {
 ArrayList<Tester2> tester2s = new ArrayList<>();
    ArrayList<Developer2> developer2s = new ArrayList<>();

    String PO;
    String BA;
    String SM;

    public void setInfo(  String PO, String BA, String SM){
        this.PO= PO;
        this.BA= BA;
        this.SM= SM;
    }
// team1; team2; team3;


    public void addTesters(Tester2[] tester2s){
        this.tester2s.addAll(Arrays.asList(tester2s));
    }

    public void removeTester(long employeeID){  //007
        tester2s.removeIf(p -> p.employeeID== employeeID);
    }                           // this is for each employee ID

    public void addDeveloper(Developer2 developer2){
        developer2s.add(developer2);
    }
    public void addDeveloper(Developer2[] developer2s){
        if (developer2s.length==0){
            return;
        }
        this.developer2s.addAll(Arrays.asList(developer2s));
    }

    public  void removeDeveloper(long employeeID){
        developer2s.removeIf(p -> p.employeeID== employeeID);
    }

    public String toString(){
        return tester2s.size()+ " testers, "+ developer2s.size()+ " developers, PO: "+PO+", BA: "+BA+", SM: "+ SM;
    }



}
