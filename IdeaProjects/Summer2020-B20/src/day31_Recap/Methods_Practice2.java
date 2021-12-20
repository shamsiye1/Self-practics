package day31_Recap;

public class Methods_Practice2 {
    public static void main(String[] args) {
        String name= "madam";
        reverse1(name);
        System.out.println(name.equals(reverse1(name)));

    }

    public static String reverse1(String str){
        String expectedResult="";
        for(int i=str.length()-1; i>=0; i--){
            expectedResult= expectedResult+ str.charAt(i);
        }
       return expectedResult;
    }

























































}
