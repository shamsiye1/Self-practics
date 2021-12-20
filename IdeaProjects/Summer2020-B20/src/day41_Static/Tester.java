package day41_Static;

 class TesterObject{
     public static void main(String[] args) {
         Tester[] testers= {new Tester(), new Tester(), new Tester(), new Tester(), new Tester()};
         testers[0].setInfo("Shamsiye",120000, "Female",29);
         testers[1].setInfo("nazakat",120000, "Female",29);
         testers[2].setInfo("patigul",110000, "Female",32);
         testers[3].setInfo("asiye",120800, "Female",31);
         testers[4].setInfo("guzalnur",100070, "Female",34);

         for( Tester each: testers){
             System.out.println(each);
         }

     }

}






public class Tester {
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


    public String toString(){
        return "name: "+ name+ ", gender: "+ gender+ ", age: "+ age+ ", salary: "+salary;
    }

}