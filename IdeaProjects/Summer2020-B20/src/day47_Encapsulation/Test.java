package day47_Encapsulation;

public class Test {
    public static void main(String[] args) {
        System.out.println( AccessModifiers.publicVariable ); // public is accessible anywhere

        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable); // default is accessible within the same package.
        AccessModifiers.defaultMethod();

//        System.out.println(AccessModifiers.privateVariable);
//        AccessModifiers.privateMethod();   // it cannot be compile wven the same package


    }
}
