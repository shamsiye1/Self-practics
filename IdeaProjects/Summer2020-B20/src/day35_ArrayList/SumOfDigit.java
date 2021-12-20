package day35_ArrayList;

public class SumOfDigit {
    public static void main(String[] args) {
        String str= "a1b2c3";
        int sum=0;

        for (int i=0; i<str.length(); i++){
            char each= str.charAt(i);
            if(each>=48 && each<=57){
               sum= sum+ Integer.parseInt(""+ each);
            }
        }
        System.out.println(sum);



















    }









}
