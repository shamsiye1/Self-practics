package day49_Inheritance.ScrumTeamTask;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ArrayList<Tester> testers= new ArrayList<>();
    public ArrayList<Developer> developers= new ArrayList<>();

    public ScrumTeam(Tester[] testers, Developer[] developers){
        addTesters(testers); // adds the array of testers to the list

        addDevelopers(developers);  // add the array of developers to the list
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));

    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(long ID){
        testers.removeIf(p -> p.ID == ID);
    }

    public void removeDeveloper(long ID){
        developers.removeIf(p -> p.ID == ID);
    }


    public void removeTesterDeveloper(int testerID, int developerID){
        removeTester(testerID);  // removes the tester from list
        removeDeveloper(developerID); // removes the developer from list
    }

    public String toString(){
        return "========================"+
                "\nDevelopers #"+developers.size()+
                "\nTesters #"+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+" point(Dev.Team*8 Days)"+
                "\nVelocity: "+((developers.size()+ testers.size())*8)+" point for current Sprint"+
                "\n==========================";
    }










}
