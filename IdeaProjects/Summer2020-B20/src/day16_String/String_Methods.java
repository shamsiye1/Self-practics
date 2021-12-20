package day16_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class String_Methods {
    public static void main(String[] args) {

        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);

        String word = "java";
        word = word.replace("a", "e");
        System.out.println(word);

        String sentence = "i like java , java is cool . java is fun";

        // sentence = sentence.replace("java","C#");
        sentence = sentence.replace("java", "python");

        System.out.println(sentence);
        String s1 = "i like to stay in Cybertek, Cybertek is nice place";
        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);

        s1 = s1.replace("MIT", "cYBERTTEK");
        System.out.println(s1);

        String s2 = "i like to learn java, we are enjoying java";
        s2 = s2.replace('r', 'R');

        System.out.println(s2);

        s2 = s2.replaceFirst("java", "javascript");
        System.out.println(s2);

        String s3 = "i like to drink tea and tea";
        s3 = s3.replaceFirst("tea", "cola");
        System.out.println(s3);

        String s4 = "i like to watch game of thrones, and waliking dead";
        s4 = s4.replace(", and waliking dead", "");
        System.out.println(s4);

        // indexOf()
        String s5 = "i like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("c");
        int r2 = s5.indexOf("re");
        int r3 = s5.indexOf("rn");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        //lastIndexOF()
        String s6 = "java is a programming language, and java is fun";
        int l1 = s6.indexOf("j");
        System.out.println(l1);
        int l2 = s6.lastIndexOf("j");
        System.out.println(l2);
        String s7 = "java";
        int a1 = s7.indexOf("A");
        System.out.println(a1);

        String s8 =  "Java";
        int a = s8.indexOf("a");





    }


}
