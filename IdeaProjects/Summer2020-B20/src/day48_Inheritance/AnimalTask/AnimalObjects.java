package day48_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {

    Dog dog1 = new Dog("winston","medium",3,'M',"secrum", 1.3);
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1);

        Cat cat1= new Cat("Altuhan","small",1,'M',"angone",4.1);
        System.out.println(cat1);

    }
}
