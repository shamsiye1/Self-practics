package day39_CustomClass;

public class dog {
    // instance variables: breed, size, age, color,
    // instance methods:  setDogInfo, getDogInfo, eat, drink, sleep....

    String name;
    String breed;
    String size;
     int age;
     String color;

     public void setDogInfo(String dogName,String dogBreed, String dogSiz, int dogAge, String dogColor){
         name= dogName;
         breed = dogBreed;
         size = dogSiz;
         age = dogAge;
         color= dogColor;

     }
     // sets the info of the dog

    public void getDogInfo(){
        System.out.println("Name: "+ name+", Breed: "+breed+", Size: "+size+ ", Color: "+color+", Age: "+ age+" years old");

    }

    public void eat(String food){
        System.out.println(name+ " is eating "+ food);
    }

    public void drink(String drink){
        System.out.println(name+ " is dringking "+ drink);
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");

    }


    // dog1: husky  dog2:pitbull  dog3: golden retriever






}
