package day41_Static;

public class cat {
    String name;
    int age;
    String gender;
    String color;
    String breed;

    public void setCatInfo(String name, int age, String gender, String color, String breed){
        this.name= name;
        this.age= age;
        this.gender= gender;
        this.color= color;
        this.breed= breed;
    }

    public String toString(){
        return "This cat name is: "+ name +", and "+ age+ " years old, she is "+ gender+ ", "+ color+ ", "+ breed;
    }
    public void eat(String food){
        System.out.println(name+ " is eating "+ food);

    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+ drink);
    }
































}
