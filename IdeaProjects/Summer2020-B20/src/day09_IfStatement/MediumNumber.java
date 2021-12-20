package day09_IfStatement;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 140;
        double b = 34;
        double c = 1;

        boolean aIsMed = ( a > b && a < c) || ( a<b && a >c);
        boolean bIsMed = ( b > a && b < c) || ( b< a && b>c);
        boolean cIsMed = ( c > a && c < b) || (c <a && c > b);
        // boolean cIsMed = !aIsMed && !bIsMed;
        double Med = 0;
        if ( aIsMed){
            Med = a;
        }
        if ( bIsMed){
            Med = b;
        }
        if ( cIsMed){
            Med = c;
        }
        System.out.println(Med + " is meddle number");



































    }



















}
