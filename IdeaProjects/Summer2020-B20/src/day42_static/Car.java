package day42_static;

public class Car {
    String brand, model, VIN, color;
    double price;
    int year;

    static boolean hasWheel= true;
    static int numberOfTires= 4;
    static boolean hasEngine= true;
    static boolean hasDoors= true;
    static boolean hasAirBag= true;
    static boolean hasSeatBelt= true;
    static boolean hasHorn = true;


    public void start(){
        System.out.println("Starting "+ brand+ " "+model);
    }

    public static void printTires(){

        System.out.println(numberOfTires+ " Tires");
    }

    public  String toString(){
        return "brand: "+ brand+ ", model: "+ model+ ", year: "+year+ ", color: "+color+ "\nNumber of tires: "+ numberOfTires + "\nHas Engine: "+ hasEngine+"\nHas wheel: "+ hasWheel+ "\nHas airbags: "+ hasAirBag;
    }








}
