package day10_IfStatements;

public class Character_Identify {
    public static void main(String[] args) {
      char character = 'A';
      boolean iSAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character<=127);
       //                      upper case letters           // lower case letter
        boolean isDigit = character >= 48 && character<= 57;
        boolean specialCha= iSAlphabetic== false && isDigit == false;

        String alphabet = "";

        if(iSAlphabetic) {
            alphabet = character + " is Alphabetic character";

            //System.out.println(character + " is Alphabetic character");
        }else{
            alphabet = character + " is not alphabetic character";


            //System.out.println(character + " is alphabetic character");
        }
        System.out.println(alphabet);
        /*if(!iSAlphabetic) {
            System.out.println(character + " is not alphabetic character");
        } */
        String digit = "";
        if(isDigit == true){
            digit = character + " is a digit character";
        }else {
            digit = character + " is not a digit";
        }
        System.out.println(digit);

        String specialCharacter = "";
        if( specialCha == true){
            specialCharacter = character + " is a special character";
        }else{
            specialCharacter = character + " is not a special character";
        }
        System.out.println(specialCharacter);










    }


}
