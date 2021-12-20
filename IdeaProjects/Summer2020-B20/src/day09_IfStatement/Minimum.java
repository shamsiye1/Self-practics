package day09_IfStatement;

public class Minimum {
    public static void main(String[] args) {
        double a = 500;
        double b= 10000;
        double c = 300;
        boolean aMin = a < b && a < c;
        boolean bMin = !aMin && b < c;
        boolean cMin = !aMin && !bMin;
        double Min = 0;
        if (aMin){
            Min = a;
        }
        if (bMin){
            Min = b;
        }
        if (cMin){
            Min = c;
        }
        System.out.println(Min + " is Minimum number");




























    }


























}
