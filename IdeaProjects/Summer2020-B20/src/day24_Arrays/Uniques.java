package day24_Arrays;
// write a program that can find the unique characters from a String.
//  example: input: aabbccd
//           output: bd
public class Uniques {
    public static void main(String[] args) {
        String str = "aabccd";
        String nonDup = "";

        for(int i = 0; i<= str.length()-1; i++){

            String ch = str.charAt(i) + "";
          int first = str.indexOf(ch);
          int last = str.lastIndexOf(ch);

          if(first==last){
              nonDup = nonDup+ch;
          }
            }

        System.out.println(nonDup);


    }




    }































































































































