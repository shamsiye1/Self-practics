package day25_Practices;

public class LongestString2 {
    public static void main(String[] args) {
        String arr[]= {"halid","amin","nazakat","asiyeTurgun","ali"};

        int longest = arr[0].length();

        for(String each: arr){

            int lengthEach = each.length();
            if(lengthEach> longest){
                longest = lengthEach;
            }
        }
            for(String each: arr){
                if(each.length() == longest){
                    System.out.println(each);
                }
            }











































    }
















































}
