package day10_08;

public class SelfTask {

    public static void main(String[] args) {

 //       String input = null;
   //     System.out.println("-" + input.trim() + "-");

//
//        sum(0,0);
//        sum(-1,-1);

        System.out.println(sum(1,sum(0,1)));



    }

    public static int sum(int a, int b){

       if (a+b>1)
           return 0;
        System.out.println(a+b);
        return a+b;
    }
}
