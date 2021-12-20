package day44_Constructor;


// Access- Modifier  className(Parameters){
//
// statements;        ====> this is constructor formula
// }
public class ConstructorIntro {

    public ConstructorIntro (String arr){
        System.out.println("Hello"+ arr);
    }

    public static void main(String[] args) {

       ConstructorIntro obj1 = new ConstructorIntro("abc");
        ConstructorIntro obj2 = new ConstructorIntro("muhtar");
        ConstructorIntro obj3= new ConstructorIntro("dawut");
        ConstructorIntro obj4 = new ConstructorIntro("zeliha");
        ConstructorIntro obj5 = new ConstructorIntro("amina");







    }

}
