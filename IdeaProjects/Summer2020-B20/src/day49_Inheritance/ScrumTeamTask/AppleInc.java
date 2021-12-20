package day49_Inheritance.ScrumTeamTask;

import day43_Static.Test;

public class AppleInc {

    public static void main(String[] args) {
        Tester tester1=new Tester("nazakat",30,'f',1250000,123456,"SDET");
        Tester tester2=new Tester("MUBARAK",40,'f',1250080,123456,"SDET");
        Tester tester3=new Tester("Asiye",31,'f',1290000,1237886,"QA");

        Tester[] testers={tester1, tester2,tester3};

        Developer developer1= new Developer("nazakat",30,'f',1250000,123456,"SDET");
        Developer developer2= new Developer("Maryam",32,'f',1270000,12453456,"AQa");
        Developer developer3= new Developer("nuramina",21,'f',7850000,1237856,"SDET");

        Developer[] developers={developer1,developer2,developer3};

        ScrumTeam scrum1= new ScrumTeam(testers, developers);

        System.out.println(scrum1);

        Tester[] testers2= {
                new Tester("Zilnaz",3,'f',1250000,123456,"SDET"),
                new Tester("sumayya",41,'f',1250000,123456,"SDET")
        };

        Developer[] developers2={
                new Developer("amina",38,'f',1250000,123456,"SDET"),
                new Developer("elminur",31,'f',1250000,123456,"SDET"),
                new Developer("vola",78,'f',1250000,123456,"SDET")
        };

        ScrumTeam scrum2=new ScrumTeam(testers2,developers2);
        System.out.println(scrum2);

        

        ScrumTeam[] allScrumTeam={scrum1,scrum2};

        for (ScrumTeam eachScrum: allScrumTeam){
            for (Tester eachTester: eachScrum.testers){
                System.out.println(eachTester.name+" "+eachTester.salary);
            }
        }

        for (ScrumTeam eachScrum: allScrumTeam){
            for (Developer eachDeveloper: eachScrum.developers){
                System.out.println(eachDeveloper.name+" "+eachDeveloper.salary);
            }
        }


    }




}
