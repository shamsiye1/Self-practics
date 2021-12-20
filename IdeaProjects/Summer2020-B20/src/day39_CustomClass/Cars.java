package day39_CustomClass;

public class Cars {
    // Attributes:
    //   model, year, color, mileage, vin.....
    String brand;
    String model;
    String color;
    int year;
    double mileage;
    double price;

    public void getInfo(){
        System.out.println(year+ " "+ brand+ " "+ model+ " "+ color+ ", "+ mileage+ ", $"+ price);
    }
    public void start(){
        System.out.println(brand+ " "+model+ " is started");
    }
    public  void setInfo(String carBrand, String carModel, int carYear, String carColor, double carPrice, double carMileage){


        brand= carBrand;
        model= carModel;
        year= carYear;
        color= carColor;
        price=carPrice;
        mileage= carMileage;






    }

}
