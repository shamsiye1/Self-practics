package day23_Arrays;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str = "ABAcceedAB";  //   A2B2
        String nonDup="";      // "AB"
        String result="";      //"A2B2"

        for( int i= 0; i<= str.length()-1; i++){
            String ch = str.charAt(i) +"";
            if( !nonDup.contains(ch)){
                nonDup= nonDup + ch;
            }
        }

        System.out.println(nonDup);

       // str = "ABAB"   nonDup = "AB"


        for(int j = 0; j<= nonDup.length()-1; j++){

            char ch = nonDup.charAt(j);  //A
            int count = 0;
            for (int i = 0; i<= str.length()-1; i++){
                if(str.charAt(i)== ch){
                    count++;
                }
            }
            result += ""+ch+ count;

        }
        System.out.println(result);
























































































    }

































































































}
