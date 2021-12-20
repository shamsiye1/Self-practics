package Day32_MethodOverLoading;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {
        String firstName= "elkEm";
        String lastName= "MijiT";
        String fullName;
        fullName= Util.formatFullName(firstName, lastName);
        System.out.println(fullName);

        String uniques= Util.Unique(fullName.toLowerCase());
        System.out.println(uniques);

        String reversedName= Util.reverse(fullName);
        System.out.println(reversedName);

        System.out.println("==============================");

        int[] a={100,50,22,88888,55,559,1000};
        int n= 2500;
        Util.addElement(a,n);
        System.out.println(Arrays.toString( Util.addElement(a,n)));


    }













}
