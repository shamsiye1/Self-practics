package Library;
import day47_Encapsulation.AccessModifiers;
public class Test_AccessModifiers {
    public static void main(String[] args) {

        //
        System.out.println(AccessModifiers.publicVariable);// public is visible everywhere
        AccessModifiers.publicMethod();

    //    System.out.println(AccessModifiers.defaultVariable); // default is not accessible outside the package.
    //    AccessModifiers.defaultMethod();  <=== same reason with upstairs


//        System.out.println(AccessModifiers.privateVariable);
//        AccessModifiers.privateMethod();  ===> private cannot visible


    }
}
