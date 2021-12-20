package day29_CustomMethods;

public class removeDuplicates {

    public static void main(String[] args) {
        String str="aaaaaaaadddddddddredgggddddddd";
        removeDup(str);
    }



    public static void removeDup(String str){
        String nonDup="";
        for(String each: str.split("")){
            if(!nonDup.contains(each)){
                nonDup= nonDup+each;
            }
        }
        System.out.println(nonDup);
    }
















}
