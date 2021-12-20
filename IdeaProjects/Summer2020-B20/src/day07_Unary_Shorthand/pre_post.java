package day07_Unary_Shorthand;

public class pre_post {
    public static void main (String [] args){
        int a = 10;
        // pre increment and decrement
        System.out.println(++a);
        System.out.println(a);

        int b = 10;
        System.out.println(b++);
        System.out.println(b++);


        int c = 25;
        System.out.println(c++);// c+1
        c++;
        System.out.println(c);

        System.out.println(--c);

        int x = 88;
        int y = x--;
        System.out.println(x);
        System.out.println(y);
        System.out.println("==============================");
        int w= 50;
        w = --w + w++ + w-- + w++;
        // w= 49 + 49 + 48 + 49
        System.out.println(w);
















    }













}
