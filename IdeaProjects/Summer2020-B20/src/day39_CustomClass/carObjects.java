package day39_CustomClass;

public class carObjects {
    public static void main(String[] args) {

        Cars car1= new Cars();
             car1.brand= "toyota";
             car1.model= "corolla";
             car1.year= 2020;
             car1.color= "white";
             car1.mileage=2000;
             car1.price= 190000.23;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println("===============================");
        Cars car2= new Cars();
        System.out.println(car2.brand);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);

        System.out.println("===================================");

        Cars car3= new Cars();
        car3.setInfo("audi","a7",2017,"white",32000, 6999);


        Cars car4= new Cars();
        car4.setInfo("jeep","wrangler",1997,"blue", 9000,9655);


        car3.getInfo();
        car4.getInfo();







    }
}
