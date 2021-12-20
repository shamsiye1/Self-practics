package day10_08;

public class quize {
    public static void main(String[] args) {
//        int n=5;
//        for (int i=0; i<5; i++){
//            n+=i;
//        }
//        System.out.println(n);

    String s="The sun set quickly and created a shadow";

    String a=s.substring(10);
    if (a.length()> s.length()){
        System.out.println(a);
    }else {
        System.out.println(s);
    }

//String str=method7("on the weekend",20);
//        System.out.println(str);

        int[] arr={5,7,3,8,20,14};
method8(arr);
    }

    public static String method3(int num){
        if (num<0){
            return "less than 0";

        }else if (num<50){
            return "less than 50";
        }else if (num<100){
            return  "less than 100";
        }else {
            return "other";
        }


    }

    public  static int method4(char c, String s){

        if (s.contains(""+c)){
            return 1;
        }else {
            return 0;
        }
    }


    public static String method7(String str, int s){

        if (s<10){
            str= str.substring(8);

        }else {
            if (str.length()>s){
                str="weekdays";
            }else if (s>10){
                str= str.substring(7);
            }
        }
        return str;

    }

    public static void method8(int[] arr){
        for (int n: arr){
            if (n%2==0){
                continue;
            }
            System.out.println(n);
        }
    }

}
