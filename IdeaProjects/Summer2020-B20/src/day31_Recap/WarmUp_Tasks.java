package day31_Recap;

public class WarmUp_Tasks {

    public static void main(String[] args) {
        String str= "abbcccddaaaaaaaaaaaf";
        String uniques= "";

        for(int i= 0; i<=str.length()-1; i++){

            char ch= str.charAt(i);
            int countNum= frequency(str, ch);
            if(countNum==1){
                uniques= uniques+ ch;
            }
        }


        System.out.println(uniques);

    }



    public static  int frequency(String str, char ch){
        int count=0;
        for(char each : str.toCharArray()){
            if(each==ch){
                count++;
            }
        }
        return  count;

    }













































}
