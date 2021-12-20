package day29_CustomMethods;

public class Unique_Elements {

    public static void main(String[] args) {
        String[] arr={"A","B","C","B"};
        uniques(arr);
        System.out.println("Hello world");
        String[] arr2={"D","D","E","C","F","F"};
        uniques(arr2);
    }




    public static void uniques(String[] arr){
        for(String a: arr){
            int count=0;
            for(String each: arr){
                if(a.equals((each))){
                    count++;
                }
                }
            if(count==1){
                System.out.println(a+" ");
            }
            }
        }
    }
































