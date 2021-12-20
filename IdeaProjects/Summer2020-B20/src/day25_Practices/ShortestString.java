package day25_Practices;

public class ShortestString {
    public static void main(String[] args) {
        String arr[]={"our", "love", "java", "programming", "language","ami"};

          int minLength = arr[0].length();

        for(int i = 0; i<=arr.length-1; i++){     // to find out the
                                              // minimum length of the String in array
            int lengthEach=arr[i].length();
            if(lengthEach < minLength){
                minLength = lengthEach;

            }
        }
        System.out.println(minLength);

        for (int i =0; i<= arr.length-1; i++){
            if(arr[i].length()== minLength){
                System.out.println(i);
            }
        }






    }


























    }





























































