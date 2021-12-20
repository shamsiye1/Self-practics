package day25_Practices;

public class LongestString {
    public static void main(String[] args) {

        String arr[]= {"halid","amin","nazakat","asiyeTurgun","ali"};
        int longest = arr[0].length();

        for(int i = 0; i< arr.length; i++){
            int lengthEach= arr[i].length();

            if(lengthEach >longest){
                longest=lengthEach;
            }
        }
        for(int i = 0; i<= arr.length-1; i++){
            if(arr[i].length()==longest){
                System.out.println(arr[i]);
            }
        }







































    }















































}
