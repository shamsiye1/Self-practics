package day25_Practices;

public class ShortesString2 {
    public static void main(String[] args) {
       String arr[]= {"our", "love", "java", "programming", "language","ami"};
        int minLength = arr[0].length();

        for(String each :arr){
            int lengthEach = each.length();
            if(lengthEach < minLength){
                minLength = lengthEach;
            }
        }
        for(String each : arr){
            if(each.length()== minLength){
                System.out.println(each);
            }
        }







































    }







































}
