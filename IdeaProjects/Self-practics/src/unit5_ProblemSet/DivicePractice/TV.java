package unit5_ProblemSet.DivicePractice;

public class TV extends Device{
    String brand;
    String model;
    double price;
    boolean hasWireless;

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasWireless=" + hasWireless +
                '}';
    }

    public void useDevice(){

        System.out.println(brand+ " try to using TV");

    }


}
