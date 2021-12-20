package carConstructorChaining;

public class Computer {

    double price;
    String brand;
    String color;
     static boolean hasScreen;
     static boolean hasBattery;
     static boolean hasMemory;

}

 class Pizza{

    String size;
    int numOfCheeseTop;
    int numOfVeggieTop;

    public Pizza(String size, int numOfCheeseTop, int numOfVeggieTop){
        this.size=size;
        this.numOfCheeseTop=numOfCheeseTop;
        this.numOfVeggieTop=numOfVeggieTop;

    }

    public void customizeOrder(){

        System.out.println("Order detail: "+size +"\n" +numOfCheeseTop + " of cheese"+ "\n"+numOfVeggieTop+" of veggies" );

    }

    public double calcCost(double totalCost){
        totalCost=0;

        if (size.equals("small")){

            totalCost +=10 + numOfCheeseTop*1 + numOfVeggieTop*1.5;
        }else if (size.equals("medium")){
            totalCost +=12+ numOfCheeseTop*1 + numOfVeggieTop*1.5;
        }else if (size.equals("large")){

            totalCost +=14+ numOfCheeseTop*1 + numOfVeggieTop*1.5;
        }else {
            System.out.println("not valid size");
        }


        return totalCost;
    }

     @Override
     public String toString() {
         return "Pizza{" +
                 "size='" + size + '\'' +
                 ", numOfCheeseTop=" + numOfCheeseTop +
                 ", numOfVeggieTop=" + numOfVeggieTop +
                 '}';
     }
 }