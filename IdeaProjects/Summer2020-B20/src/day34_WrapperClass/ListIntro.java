package day34_WrapperClass;
import java.util.ArrayList;
public class ListIntro {
    public static void main(String[] args) {
    ArrayList <Integer> scores= new ArrayList<Integer>();
     scores.add(95);
     scores.add(100);
     scores.add(85);
     scores.add(17);
     scores.add(2,65);

        System.out.println(scores);
        System.out.println(scores.get(2));

        System.out.println(scores.size());




    }




}
