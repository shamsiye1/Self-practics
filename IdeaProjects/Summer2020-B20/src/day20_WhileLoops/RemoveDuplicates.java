package day20_WhileLoops;
// write a program that can remove the duplicate
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbcddeecfk";

        String result = "";

        for(int i = 0; i<= str.length()-1; i++){

            String s = str.charAt(i) + "";
            //String s = str.substring(i,i+1);  also will work like charAt
            if(!result.contains(s)){
                result += s;
            }
        }
        System.out.println(result);












































































    }





















































}
