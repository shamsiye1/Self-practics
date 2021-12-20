package day29_CustomMethods;

public class reverseString {
    public static void main(String[] args) {
        reverse("shamsiye");
        reverse("miradel");
    }

    public static void reverse(String str){
   String result = "";
   for(int i=str.length()-1; i>=0; i--){
       result = result+ str.substring(i, i+1);
   }
        System.out.println(result);


    }















































}
