package day22_NestedLoops;

public class occurancesOfChar {
    public static void main(String[] args) {
        String str = "abaaaaaaaaaaaaaaaaaaaaaagggggggggggggbc";
        char ch = 'a';
        int count = 0;
        //2

//        for(int i = 0; i<= str.length()-1; i++){
//
//            char each = str.charAt(i);  // a  b  a  b  c
//            if (each == ch){
//
//                count += 1;
//            }
//
//
//        }
//
//        System.out.println(count);
//
//
    int index = 0;
    while (index <= str.length()-1){

        char each = str.charAt(index);

        if (each==ch){
            count = count + 1;
        }
        index++;
    }
        System.out.println(count);















































    }






















































































































}
