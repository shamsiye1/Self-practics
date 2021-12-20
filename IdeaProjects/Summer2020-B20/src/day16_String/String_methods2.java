package day16_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class String_methods2 {
    public static void main(String[] args) {
        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String name2 = "";
        System.out.println(name2.isEmpty());

        String str1 = "java";
        String str2 = new String();

        System.out.println(str1 + ": " + str2);
        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        String str5 = "java";
        String str6 = "java";

        System.out.println(str5 == str6);
        System.out.println(str5.equals(str6));

        String str7 = "JAVA";
        String str8 = "java";
        System.out.println(str7.equals(str8));
        System.out.println(str7.equalsIgnoreCase(str8));













































































    }


}
