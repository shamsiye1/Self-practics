package day19_ForLoop;

public class PalindromTest {

    public static void main(String[] args) {
        String str="kayak";

        String revesedStr = "";

        for(int i = str.length()-1; i>=0 ; i--){

         revesedStr+= str.charAt(i);

        }
        System.out.println(revesedStr);

        System.out.println(revesedStr.equalsIgnoreCase(str));

    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
