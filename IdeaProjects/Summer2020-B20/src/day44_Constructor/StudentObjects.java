package day44_Constructor;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1= new Student("meerim",20,'F');

       // student1.setInfo("aliye", 38, 'F');

        Student student2= new Student("Mikle",25,'F');

        //student1.setInfo("shamsiye", 18, 'F');

        Student student3= new Student("asiya",30,'M');

        //student1.setInfo("asiye", 28, 'F');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }



}
