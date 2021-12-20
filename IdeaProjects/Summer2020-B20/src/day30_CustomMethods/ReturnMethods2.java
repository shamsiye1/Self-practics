package day30_CustomMethods;

public class ReturnMethods2 {

    public static void main(String[] args) {
        String name= "leveL";

     String reversedName= revStr2(name);
        System.out.println(name.equalsIgnoreCase(revStr2(name)));


    }





    public static void revStr1(String str){

        String result ="";
        for (int i= str.length()-1;i>=0; i--){
            result = result+ str.charAt(i);
        }





    }

    public static String revStr2(String str){
      String result="";
      for (int i=str.length()-1; i>=0;i--){
          result= result+ str.charAt(i);
      }


        return result;
    }
























































}
