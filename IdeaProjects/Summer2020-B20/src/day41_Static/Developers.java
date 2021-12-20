package day41_Static;

public class Developers {
    String name;
    double salary;
    String gender;
    int age;
    public void setInfo( String name, double salary, String gender, int age){
        this.name= name;
        this.salary=salary;
        this.gender=gender;
        this.age= age;
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixBugs() {
        System.out.println(name+ " is crying");
    }
    public String toString(){
        return "name: "+ name+ ", gender: "+ gender+ ", age: "+ age+ ", salary: "+salary;
    }

    }


    class DeveloperObject{
        public static void main(String[] args) {
            Developers[]  developers= {new Developers(), new Developers(), new Developers(), new Developers(), new Developers(),};

            developers[0].setInfo("Shamsiye",120000, "Female",29);
            developers[1].setInfo("nazakat",120000, "Female",29);
            developers[2].setInfo("patigul",110000, "Female",32);
            developers[3].setInfo("asiye",120800, "Female",31);
            developers[4].setInfo("guzalnur",100070, "Female",34);

            for(Developers each: developers ){
                each.coding();
            }

            System.out.println("=================================");
            for(int i=0; i<developers.length; i++){
                developers[i].fixBugs();
            }


        }
    }


