package day41_Static;

public class carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian ){
        this.width= width;
        this.length= length;
        this.unitPrice= unitPrice;
        this.isPersian= isPersian;
    }

    public double calcCost(){
        double totalPrice= (width*length)*unitPrice;

        if (isPersian){
            totalPrice= totalPrice+200;
        }
        return totalPrice;

     //   return (isPersian)? totalPrice+200: totalPrice; <===  this is use ternary function
    }

    public void getCarpetInfo(){
        System.out.println("===========================================");
        System.out.println("width: "+ width);
        System.out.println("length: "+ length);
        System.out.println("unit price: "+ unitPrice);
        System.out.println("total price: "+ calcCost());
        System.out.println("======================================");

    }


    public String toString(){
        return "width: "+ width+ ", length: "+length+ ", Persian made: "+ isPersian;
    }





}
