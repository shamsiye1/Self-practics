package day29_CustomMethods;

public class palindromeTest {


    public static void main(String[] args) {
        palindrome("level");
        palindrome("cyberTked");
    }

    public static void palindrome(String word){

        String reversed = "";
        for(int i= word.length()-1; i>=0; i--){
            reversed= reversed+word.substring(i,i+1);
        }
        System.out.println(reversed.equalsIgnoreCase(word));


    }




}
