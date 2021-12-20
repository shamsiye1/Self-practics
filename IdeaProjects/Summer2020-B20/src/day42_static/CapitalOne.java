package day42_static;

import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Tester2[] tester2s ={new Tester2(), new Tester2(), new Tester2()};

        tester2s[0].setInfo("aliya",15555L, "SDET",120000, 'F');
        tester2s[1].setInfo("asiye",159945L, "QA",210000, 'F');
        tester2s[2].setInfo("nazak",15585L, "Tester",420000,'F');
        System.out.println(Arrays.asList(tester2s).size());
        Developer2[] developer2s = {new Developer2(), new Developer2(), new Developer2(),new Developer2(),new Developer2(),};
        developer2s[0].setInfo("amina",19555L, "Dev lead",120800, 'F');
        developer2s[1].setInfo("mubarak",24555L, "Dev",110800, 'F');
        developer2s[2].setInfo("zilnaz",1955L, "Dev",320800, 'F');
        developer2s[3].setInfo("shamsiye",19555L, "Dev lead",120800, 'F');
        developer2s[4].setInfo("asila",19555L, "Dev",120800, 'F');


        System.out.println(tester2s[0]);




        scrumTeam team1= new scrumTeam();
        team1.setInfo("ramazan","hamit","ismail");
       // team1.addTester(testers);
       // team1.testers.addAll(Arrays.asList(testers))
        team1.addTesters(tester2s); // ====>  team1.testers.addAll(Arrays.asList(testers))
        team1.addDeveloper(developer2s);
        System.out.println(team1);

        System.out.println("===========================");

        for (Tester2 each: team1.tester2s){
            System.out.println(each.name+ " : $"+ each.salary); // each: every single testers in the scrum team
        }

        System.out.println("===========================================================");
        for (Developer2 each: team1.developer2s){
            System.out.println(each.name+ " salary: $"+ each.salary);
        }

        System.out.println("========================================================");

        team1.removeTester(15555L);
        team1.removeDeveloper(1955L);

        System.out.println(team1);
        System.out.println("========================================");

        Developer2 dev1= new Developer2();
        dev1.setInfo("gulen",2113L, "dev lead", 500000,'F');
        team1.addDeveloper(dev1);
        System.out.println(team1);

     scrumTeam[] scrumTeams= {team1, new scrumTeam(), new scrumTeam()};
     // print all developers and testers from the scrum team,
        // find a maximum salary


















    }
}
