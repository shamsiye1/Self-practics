package unit5_ProblemSet.DivicePractice;

public class Phone extends Device{
    String brand;
    String model;
    double price;
    boolean hasWireless;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasWireless=" + hasWireless +
                '}';
    }

    public void useDevice() {
        System.out.println(brand + " is try to using Phone");
    }


}
