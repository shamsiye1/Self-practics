package day35_ArrayList;

public class SumOfDigit_2 {
    public static void main(String[] args) {
        String str="123";
        int sum=0;
        for (char each: str.toCharArray()){
            if(Character.isDigit(each)){
                sum= sum+ Integer.parseInt(""+each);
            }
        }

        System.out.println(sum);





























    }
}
