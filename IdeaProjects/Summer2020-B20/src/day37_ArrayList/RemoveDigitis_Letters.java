package day37_ArrayList;

import sun.text.normalizer.UCharacter;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigitis_Letters {
    public static void main(String[] args) {

        ArrayList<Character> chars= new ArrayList<>();
        chars.addAll(Arrays.asList('a','1','2','c','d','m','5','$','&'));

        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);

        System.out.println("======================================");

        ArrayList<Character> list= new ArrayList<>();
        list.addAll(Arrays.asList('a','c','4','u','6','m','l','*','@','p','+'));


        ArrayList<Character> digits= new ArrayList<>();
        digits.addAll(list);
        digits.removeIf( p-> !Character.isDigit(p));

        System.out.println(digits);

        ArrayList<Character> letters= new ArrayList<>();
        letters.addAll(list);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> specialCharacters= new ArrayList<>();

        specialCharacters.addAll(list);
//        specialCharacters.removeIf(p-> Character.isLetter(p) || Character.isDigit(p) );
        specialCharacters.removeAll(letters);
        specialCharacters.removeAll(digits);

        System.out.println(specialCharacters);




















    }



}
