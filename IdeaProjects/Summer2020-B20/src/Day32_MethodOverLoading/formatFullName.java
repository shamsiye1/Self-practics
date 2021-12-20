package Day32_MethodOverLoading;

import java.util.Locale;

public class formatFullName {

    public static void main(String[] args) {
        String first="cYberteK";
        String last ="SCool";
        first = first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
        System.out.println(first);

        last = last.substring(0,1).toUpperCase()+ last.substring(1).toLowerCase();
        String fullName= first+ " "+ last;
        System.out.println(fullName);

    }

    public static String formatFullName(String firstName, String lastName){
        firstName= firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName= lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
        String fullName= firstName+ " "+ lastName;
        return fullName;
    }

















































}
